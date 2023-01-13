package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Precisao;

public class Curling extends Precisao implements Pista{

	public String varrer() {
		return "varrendo";
	}

	@Override
	public String tipoDePista() {
		// TODO Auto-generated method stub
		return "Pista de gelo";
	}
	
	
}
