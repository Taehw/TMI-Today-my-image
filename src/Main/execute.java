package Main;

import GUI.Loginsignup;
import GUI.imageupload;
import GUI.mapimageselect;
import API.weather;
public class execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imageupload.main(args);
		mapimageselect.main(args);
		Loginsignup.main(args);
		weather w = new weather();
		w.getWeather();
	}
}
