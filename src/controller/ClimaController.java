package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import model.Clima;

@WebServlet("/ManterClima.do")
public class ClimaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		JSONObject json;
		
		Clima clima = new Clima();
		RequestDispatcher dispatcher = null;
		
		switch(acao) {
		case "Tempo Real":
			json = readJsonFromUrl("http://apiadvisor.climatempo.com.br/api/v1/weather/locale/3477/current?token=25149dde939896af87233909d1ba3bfc");
			JSONObject data = (JSONObject) json.get("data");
			clima.setCidade((String) json.get("name"));
			clima.setTemperatura((int) data.get("temperature"));
			clima.setCondicao((String) data.get("condition"));
			clima.setUmidade((double) data.get("humidity"));
			clima.setVento((double) data.get("wind_velocity"));
			clima.setPressao((double) data.get("pressure"));
			request.setAttribute("clima", clima);
			dispatcher = request.getRequestDispatcher("TempoReal.jsp");
			break;
		case "Previsao":
			//Em breve
		}

		dispatcher.forward(request, response);
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
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

}
