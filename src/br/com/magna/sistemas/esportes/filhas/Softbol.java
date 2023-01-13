package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Taco;

public class Softbol extends Taco implements Campo{

	@Override
	public String tipoDeCampo() {
		// TODO Auto-generated method stub
		return "campo de softbol";
	}

}
