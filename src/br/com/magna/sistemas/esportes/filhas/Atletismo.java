package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Atletismo extends Marca implements Pista{

	
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
	public String tipoDePista() {
		// TODO Auto-generated method stub
		return "Pista de Atletismo";
	}
	
}
