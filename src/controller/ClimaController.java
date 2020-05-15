package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.Clima;
import model.Estação;
import model.Macroclima;
import model.Microclima;
import model.Previsao;

@WebServlet("/ManterClima.do")
public class ClimaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		JSONObject json;
		
		Macroclima macroclima = new Macroclima();
		Microclima microclima = new Microclima();
		Estação estação = new Estação();
		ArrayList<Clima> climas = new ArrayList<Clima>();
		ArrayList<Previsao> previsoes = new ArrayList<Previsao>();
		RequestDispatcher dispatcher = null;
		
		request.setAttribute("Mini-estação", estação);
		dispatcher = request.getRequestDispatcher("Mini-estação.jsp");	

		switch (acao) {
		case "Tempo Real":
			json = readJsonFromUrl(
					"http://apiadvisor.climatempo.com.br/api/v1/weather/locale/3477/current?token=25149dde939896af87233909d1ba3bfc");
			JSONObject data = (JSONObject) json.get("data");
			macroclima.setTemperatura(data.getInt("temperature"));
			macroclima.setSensacao(data.getInt("sensation"));
			macroclima.setCondicao(data.getString("condition"));
			macroclima.setUmidade(data.getInt("humidity"));
			macroclima.setVento(data.getInt("wind_velocity"));
			macroclima.setPressao(data.getInt("pressure"));

			json = readJsonFromUrl("https://api.thingspeak.com/channels/1057428/feeds.json?api_key=6SO5PWG67BOWB9PU");
			JSONArray feeds = (JSONArray) json.get("feeds");
			JSONObject feed = feeds.getJSONObject(feeds.length() - 1);
			microclima.setUmidade(feed.getDouble("field1"));
			microclima.setTemperatura(feed.getDouble("field2"));
			microclima.setPressao(feed.getInt("field3"));
			microclima.setPluviosidade(feed.getInt("field4"));
			microclima.setQualidadeAr(feed.getInt("field5"));
			microclima.setVento(feed.getDouble("field6"));

			climas.add(microclima);
			climas.add(macroclima);

			request.setAttribute("climas", climas);
			dispatcher = request.getRequestDispatcher("TempoReal.jsp");
			break;

		case "Previsao":
			json = readJsonFromUrl(
					"http://apiadvisor.climatempo.com.br/api/v1/forecast/locale/3477/days/15?token=25149dde939896af87233909d1ba3bfc");
			JSONArray previsao = (JSONArray) json.get("data");

			for (int i = 0; i < previsao.length(); ++i) {
				Previsao p = new Previsao();
				JSONObject prev = previsao.getJSONObject(i);
				JSONObject rain = (JSONObject) prev.get("rain");
				JSONObject temp = (JSONObject) prev.get("temperature");
				JSONObject text = (JSONObject) prev.get("text_icon");
				text = (JSONObject) text.get("text");
				p.setDate(prev.getString("date_br"));
				p.setTempMin(temp.getInt("min"));
				p.setTempMax(temp.getInt("max"));
				p.setChuvaPrec(rain.getInt("precipitation"));
				p.setChuvaProb(rain.getInt("probability"));
				p.setCondicao(text.getString("pt"));
				previsoes.add(p);
			}

			request.setAttribute("previsao", previsoes);
			dispatcher = request.getRequestDispatcher("Previsao.jsp");
			break;
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