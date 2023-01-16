package br.com.magna.sistemas.esportes.invasao;

import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Hoquei extends Invasao implements Pista {

	public String patinar() {
		return "patinando";
	}
	
	public String trombar() {
		return "trombou";
	}

	@Override
	public String tipoDePista() {
		// TODO Auto-generated method stub
		return "pista de gelo";
	}
	
}
