package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Atletismo extends Marca implements Pista{

	private final String nomeEsporte = "Atletismo";
	
	public String correr() {
		return "correndo";
	}
	
	public String pular() {
		return "pulando";
	}
	
	public String arremessar() {
		return "arremessou";
	}

	@Override
	public String especificacaoPista() {
		// TODO Auto-generated method stub
		return "Pista de " + nomeEsporte;
	}
	
}
