package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class teste {

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		URLConnection openConnection = new URL(url).openConnection();
		openConnection.addRequestProperty("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
		InputStream is = openConnection.getInputStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	public static void main(String[] args) throws IOException, JSONException {
		JSONObject json = readJsonFromUrl(
				"http://apiadvisor.climatempo.com.br/api/v1/forecast/locale/3477/days/15?token=25149dde939896af87233909d1ba3bfc");
		JSONArray previsoes = (JSONArray) json.get("data");
		//System.out.println(json.toString());
		for (int i = 0; i < previsoes.length(); ++i) {
		    JSONObject prev = previsoes.getJSONObject(i);
		    JSONObject text = (JSONObject) prev.get("text_icon");
		    JSONObject texto = (JSONObject) text.get("text");
		    System.out.println(texto.toString());
			//System.out.println(prev.getString("date_br") + ": " + text.getString("text"));
		}
	}
}