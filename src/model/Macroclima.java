package model;

public class Macroclima extends Clima {
	
	private int temperatura;
	private int sensacao;
	private String condicao;
	private int umidade;
	private int vento;
	private int pressao;
	
	public Macroclima() {
	}

	public int getSensacao() {
		return sensacao;
	}

	public void setSensacao(int sensacao) {
		this.sensacao = sensacao;
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
		return "Macroclima [temperatura=" + temperatura + ", sensacao=" + sensacao + ", condicao=" + condicao
				+ ", umidade=" + umidade + ", vento=" + vento + ", pressao=" + pressao + "]";
	}
	
}