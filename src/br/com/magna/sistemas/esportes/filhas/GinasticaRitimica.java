package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Ginasio;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class GinasticaRitimica extends Tecnico implements Ginasio{

	@Override
	public String tipoDeGinasio() {
		// TODO Auto-generated method stub
		return "ginasio de ginastica";
	}

	
}
