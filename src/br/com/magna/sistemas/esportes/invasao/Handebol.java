package br.com.magna.sistemas.esportes.invasao;

import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Handebol extends Invasao implements Quadra {

	@Override
	public String tipoDeQuadra() {
		// TODO Auto-generated method stub
		return "quadra de handebol";
	}

}
