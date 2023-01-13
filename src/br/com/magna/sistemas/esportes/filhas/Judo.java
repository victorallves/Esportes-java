package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Octogono;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Judo extends Combate implements Octogono {

	@Override
	public String tipoDeRingue() {
		// TODO Auto-generated method stub
		return "tatame";
	}

}
