package model;

public class Clima {
	
	private String cidade;
	private int temperatura;
	private String condicao;
	private int umidade;
	private int vento;
	private int pressao;
	
	public Clima(int temperatura, String condicao, int umidade, int vento, int pressao) {
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

	public int getUmidade() {
		return umidade;
	}

	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}

	public int getVento() {
		return vento;
	}

	public void setVento(int vento) {
		this.vento = vento;
	}

	public int getPressao() {
		return pressao;
	}

	public void setPressao(int pressao) {
		this.pressao = pressao;
	}

	@Override
	public String toString() {
		return "Clima [cidade=" + cidade + ", temperatura=" + temperatura + ", condicao=" + condicao + ", umidade="
				+ umidade + ", vento=" + vento + ", pressao=" + pressao + "]";
	}
	
}
