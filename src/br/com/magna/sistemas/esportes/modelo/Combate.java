package br.com.magna.sistemas.esportes.modelo;

public abstract class Combate extends Esportes {
	
	String tecnica;
	Double forca;
	
	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public Double getForca() {
		return forca;
	}

	public void setForca(Double forca) {
		this.forca = forca;
	}

	public String desviarGolpe() {
		return "desviou";
	}
	
	public String defenderGolpe() {
		return "defendeu";
	}
	
	public String golpear() {
		return "golpeou";
	}
	
	
}
