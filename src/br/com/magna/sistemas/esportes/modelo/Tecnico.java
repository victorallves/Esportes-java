package br.com.magna.sistemas.esportes.modelo;

public abstract class Tecnico extends Esportes {

	private String manobra;
	private String juri;

	public String getManobra() {
		return manobra;
	}

	public void setManobra(String manobra) {
		this.manobra = manobra;
	}

	public String getJuri() {
		return juri;
	}

	public void setJuri(String juri) {
		this.juri = juri;
	}

	public String saltar() {
		return "saltou";
	}

	public String equilibrar() {
		return "equilibrado";
	}

	public String manobra() {
		return "manobra";
	}

}
