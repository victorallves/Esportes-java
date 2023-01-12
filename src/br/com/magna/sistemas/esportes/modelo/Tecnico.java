package br.com.magna.sistemas.esportes.modelo;

import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.interfaces.Ginasio;

public class Tecnico extends Esportes implements Aquatico, Ginasio {

	String manobra;
	String juri;

	
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
	
	public String manobrar() {
		return "manobra";
	}

	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "nadando";
	}

	@Override
	public String mergulhar() {
		// TODO Auto-generated method stub
		return "mergulhou";
	}

}
