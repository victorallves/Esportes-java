package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Octogono;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Boxe extends Combate implements Octogono {

	@Override
	public String tipoDeRingue() {
		// TODO Auto-generated method stub
		return "Ringue de boxe";
	}

}
