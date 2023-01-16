package br.com.magna.sistemas.esportes.tecnico;

import br.com.magna.sistemas.esportes.interfaces.Ginasio;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class GinasticaAcrobatica extends Tecnico implements Ginasio{

	@Override
	public String tipoDeGinasio() {
		// TODO Auto-generated method stub
		return "ginasio de ginastica";
	}

}
