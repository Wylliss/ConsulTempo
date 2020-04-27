package model;

public class Clima {
	
	private String cidade;
	private int temperatura;
	private String condicao;
	private double umidade;
	private double vento;
	private double pressao;
	
	public Clima(int temperatura, String condicao, double umidade, double vento, double pressao) {
		cidade = "São Paulo";
		this.temperatura = temperatura;
		this.condicao = condicao;
		this.umidade = umidade;
		this.vento = vento;
		this.pressao = pressao;
	}
	
	public Clima() {
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public double getUmidade() {
		return umidade;
	}

	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}

	public double getVento() {
		return vento;
	}

	public void setVento(double vento) {
		this.vento = vento;
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(double pressao) {
		this.pressao = pressao;
	}

	@Override
	public String toString() {
		return "Clima [cidade=" + cidade + ", temperatura=" + temperatura + ", condicao=" + condicao + ", umidade="
				+ umidade + ", vento=" + vento + ", pressao=" + pressao + "]";
	}
	
}
