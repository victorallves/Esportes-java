package br.com.magna.sistemas.esportes.modelo;

public abstract class Marca extends Esportes {

	private Double distancia;
	private Double tempo;
	private Double limite;
	
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String baterMeta() {
		return "bateu a meta";
	}
	
	
}
