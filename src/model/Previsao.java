package model;

public class Previsao {
	private String date;
	private int tempMin;
	private int tempMax;
	private int chuvaProb;
	private int chuvaPrec;
	private String condicao;
	
	public Previsao(String date, int tempMin, int tempMax, int chuvaProb, int chuvaPrec, String condicao) {
		this.date = date;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.chuvaProb = chuvaProb;
		this.chuvaPrec = chuvaPrec;
		this.condicao = condicao;
	}
	
	public Previsao() {
		
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTempMin() {
		return tempMin;
	}
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	public int getTempMax() {
		return tempMax;
	}
	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	public int getChuvaProb() {
		return chuvaProb;
	}
	public void setChuvaProb(int chuvaProb) {
		this.chuvaProb = chuvaProb;
	}
	public int getChuvaPrec() {
		return chuvaPrec;
	}
	public void setChuvaPrec(int chuvaPrec) {
		this.chuvaPrec = chuvaPrec;
	}
	public String getCondicao() {
		return condicao;
	}
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	
	@Override
	public String toString() {
		return "Previsao [data=" + date + ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", chuvaProb="
				+ chuvaProb + ", chuvaPrec=" + chuvaPrec + ", condicao=" + condicao + "]";
	}

}