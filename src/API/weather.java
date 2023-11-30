package API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject; // 변경된 import 구문

public class weather {
    protected String my_key = "30495057e77d3ce6879a2de24c1c8c94"; // 여기에 실제 API 키를 넣어주세요
    protected String lat = "36.68", lon = "127.55";
    public String weather;

    public void getWeather() {
        try {
            String urlStr = "http://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + my_key;
            String line, ret = "";
            URL url = new URL(urlStr);
            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line = bf.readLine()) != null) {
                ret = ret.concat(line);
            }

            // 문자열을 JSON으로 파싱
            JSONObject jsonObj = new JSONObject(ret);
            // 날씨
            JSONArray weatherArray = jsonObj.getJSONArray("weather");
            JSONObject obj = weatherArray.getJSONObject(0);
            System.out.println(obj.get("main"));
        } catch (Exception e) {
            System.out.println("날씨 정보 불러오기 실패");
            e.printStackTrace(); // 에러 메시지 및 스택 트레이스 출력

        }
    }
}
