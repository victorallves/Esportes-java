package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Esgrima extends Combate implements Pista{

	@Override
	public String tipoDePista() {
		// TODO Auto-generated method stub
		return "pista de esgrima";
	}

}
