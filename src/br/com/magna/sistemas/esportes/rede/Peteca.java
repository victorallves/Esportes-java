package br.com.magna.sistemas.esportes.rede;

import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Rede;

public class Peteca extends Rede implements Quadra {

	@Override
	public String tipoDeQuadra() {
		// TODO Auto-generated method stub
		return "quadra de peteca";
	}

}
