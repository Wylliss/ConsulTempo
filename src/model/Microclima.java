package model;

public class Microclima extends Clima {
	private double umidade;
	private double temperatura;
	private int pressao;
	private int pluviosidade;
	private int qualidadeAr;
	private double vento;
	private double latitude;
	private double longitude;
	private String date;
	private String hora;

	public double getUmidade() {
		return umidade;
	}

	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public int getPressao() {
		return pressao;
	}

	public void setPressao(int pressao) {
		this.pressao = pressao;
	}

	public int getPluviosidade() {
		return pluviosidade;
	}

	public void setPluviosidade(int pluviosidade) {
		this.pluviosidade = pluviosidade;
	}

	public int getQualidadeAr() {
		return qualidadeAr;
	}

	public void setQualidadeAr(int qualidadeAr) {
		this.qualidadeAr = qualidadeAr;
	}

	public double getVento() {
		return vento;
	}

	public void setVento(double vento) {
		this.vento = vento;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Microclima [umidade=" + umidade + ", temperatura=" + temperatura + ", pressao=" + pressao
				+ ", pluviosidade=" + pluviosidade + ", qualidadeAr=" + qualidadeAr + ", vento=" + vento + ", latitude="
				+ latitude + ", longitude=" + longitude + ", date=" + date + ", hora=" + hora + "]";
	}

}