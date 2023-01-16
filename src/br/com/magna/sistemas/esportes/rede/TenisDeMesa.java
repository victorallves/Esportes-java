package br.com.magna.sistemas.esportes.rede;

import br.com.magna.sistemas.esportes.interfaces.Ginasio;
import br.com.magna.sistemas.esportes.modelo.Rede;

public class TenisDeMesa extends Rede implements Ginasio{

	@Override
	public String tipoDeGinasio() {
		// TODO Auto-generated method stub
		return "ginasio esportivo com mesa de tenis";
	}

}
