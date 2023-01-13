package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class PatinacaoArtistica extends Tecnico implements Pista{

	public String girar() {
		return "girando";
	}
	
	public String patinar() {
		return "patinando";
	}

	@Override
	public String tipoDePista() {
		// TODO Auto-generated method stub
		return "Pista de gelo";
	}
	
}
