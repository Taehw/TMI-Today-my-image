package DB;

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
 

public class imageDBconnection extends DB_connection {

    private String fileScope;
    public String pdsLat = "";
    public String pdsLon = "";
    public String my_local = "";

    // Constructor
    public imageDBconnection(String filePath) {
        this.fileScope = filePath;
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
    public void uploadImg(String imgUrl, int idNum, String memo) {
        try {
            imageDBconnection img = new imageDBconnection(imgUrl);
            img.processImageMetadata();
            String x = img.pdsLat;
            String y = img.pdsLon;
            img.getLocal(y, x);
            String location = img.my_local;

            PreparedStatement ps = conn.prepareStatement("INSERT INTO photo_table (img_url, date, location, user_id,memo) VALUES (?, curdate(), ?, ?,?)");
            ps.setString(1, imgUrl);
            ps.setString(2, location);
            ps.setInt(3, idNum);
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


public String get_date(String url) {
    try {
        PreparedStatement ps = conn.prepareStatement("SELECT date FROM photo_table WHERE img_url = ?");
        ps.setString(1, url);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String date = rs.getString("date");
            return date;
        } else {
            return null;
        }
    } catch (SQLException e) {
        System.err.println("에러 발생");
        e.printStackTrace();
        return null;
    }
}
public String get_local(String url) {
    try {
        PreparedStatement ps = conn.prepareStatement("SELECT location FROM photo_table WHERE img_url = ?");
        ps.setString(1, url);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String local = rs.getString("location");
            return local;
        } else {
            return null;
        }
    } catch (SQLException e) {
        System.err.println("에러 발생");
        e.printStackTrace();
        return null;
    }
}
}