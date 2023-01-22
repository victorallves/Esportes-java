package br.com.magna.sistemas.esportes.modelo;

public abstract class Precisao extends Esportes {

	private String mira;
	private String alvo;
	
	
	public String getMira() {
		return mira;
	}

	public void setMira(String mira) {
		this.mira = mira;
	}

	public String getAlvo() {
		return alvo;
	}

	public void setAlvo(String alvo) {
		this.alvo = alvo;
	}

	public String tacada() {
		return "Tacada realizada";
	}
	
	public String lancar() {
		return "Lançamento realizado";
	}
	
	public String Mira() {
		return "mirando";
	}
	
	public String alvo() {
		return "acertou o alvo";
	}
	
}
