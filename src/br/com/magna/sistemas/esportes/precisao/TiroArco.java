package br.com.magna.sistemas.esportes.precisao;

import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Precisao;

public class TiroArco extends Precisao implements Campo{

	@Override
	public String tipoDeCampo() {
		// TODO Auto-generated method stub
		return "campo gramado";
	}

}
