package jdbc_connection;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import org.json.JSONArray;
import org.json.JSONObject;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.GpsDirectory;

public class Image_form extends DB_connection {

    private String fileScope;
    public String pdsLat = "";
    public String pdsLon = "";
    public String my_local = "";

    // Constructor
    public Image_form(String fileScope) {
        this.fileScope = fileScope;
        processImageMetadata();
    }

    // Process image metadata
    public void processImageMetadata() {
        try {
            File file = new File(fileScope);
            Metadata metadata = ImageMetadataReader.readMetadata(file);
            GpsDirectory gpsDirectory = metadata.getFirstDirectoryOfType(GpsDirectory.class);

            if (gpsDirectory != null && gpsDirectory.containsTag(GpsDirectory.TAG_LATITUDE) && gpsDirectory.containsTag(GpsDirectory.TAG_LONGITUDE)) {
                pdsLat = String.valueOf(gpsDirectory.getGeoLocation().getLatitude());
                pdsLon = String.valueOf(gpsDirectory.getGeoLocation().getLongitude());
            } else {
                System.out.println("GPS 정보가 없습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getLocal(String lat, String lon) {
        final String GEOCODE_URL = "https://dapi.kakao.com/v2/local/geo/coord2address.json?";
        final String GEOCODE_USER_INFO = "KakaoAK 7505cda85b7350892aa627f16fba289c";

        try {
            String coordinatesystem = "WGS84";
            URL obj = new URL(GEOCODE_URL + "x=" + lat + "&y=" + lon + "&input_coord=" + coordinatesystem);

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", GEOCODE_USER_INFO);
            con.setRequestProperty("content-type", "application/json");
            con.setDoOutput(true);
            con.setUseCaches(false);

            Charset charset = Charset.forName("UTF-8");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), charset));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            String jsonData = response.toString();
            JSONObject jsonObject = new JSONObject(jsonData);
            JSONArray documents = jsonObject.getJSONArray("documents");
            JSONObject firstDocument = documents.getJSONObject(0);           
            JSONObject roadAddressObject = firstDocument.getJSONObject("address");
            my_local = roadAddressObject.optString("region_1depth_name", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Upload image details to the database
    public void uploadImg(String imgUrl, String idNum,String memo) {
        try {
            Image_form img = new Image_form(imgUrl);
            img.processImageMetadata();
            String x = img.pdsLat;
            String y = img.pdsLon;
            img.getLocal(y, x);
            String location = img.my_local;

            PreparedStatement ps = conn.prepareStatement("INSERT INTO photo_table (img_url, date, location, user_id,memo) VALUES (?, curdate(), ?, ?,?)");
            ps.setString(1, imgUrl);
            ps.setString(2, location);
            ps.setString(3, idNum);
            ps.setString(4,memo);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> downloadImg(String local) {
    	ArrayList<String> url=new ArrayList<>();
    	try {
        PreparedStatement ps = conn.prepareStatement("SELECT img_url FROM photo_table WHERE location=?" );
        ps.setString(1, local);
        ResultSet rs=ps.executeQuery();
        while (rs.next()) {
            String imgUrl = rs.getString("img_url");
            url.add(imgUrl);
        }
        rs.close();
        ps.close();
        return url;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    	return new ArrayList<String>();
    }
    
    public ArrayList<String> deleteImg(String imgUrl) { //deleteImg(url,지역)
    	 Image_form del_img = new Image_form(imgUrl);
         del_img.getLocal(del_img.pdsLat, del_img.pdsLon);
    	try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM photo_table WHERE img_url=?" );
            ps.setString(1, imgUrl);
            ps.executeQuery();
            return this.downloadImg(my_local);   //삭제하고나서 남아있는 img_url리턴
            
    	}catch(SQLException e) {
            e.printStackTrace();
            return new ArrayList<String>();
        }
    }
    
    
    public void up_reply(String imgUrl,String user_id,String memo) {
    	try {
            PreparedStatement ps = conn.prepareStatement("UPDATE photo_table SET reply=user_id=? : memo=? WHERE img_url=ImgUrl=?" );
            ps.setString(1, user_id);
            ps.setString(2, memo);
            ps.setString(3, imgUrl);
            ps.executeUpdate();
    	}catch(SQLException e) {
            e.printStackTrace();
        }
    	
    }
    
}
