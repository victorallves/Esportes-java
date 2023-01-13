package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Rede;

public class Volei extends Rede implements Quadra {

	@Override
	public String tipoDeQuadra() {
		// TODO Auto-generated method stub
		return "quadra dde volei";
	}

}
