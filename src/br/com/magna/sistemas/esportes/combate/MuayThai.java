package br.com.magna.sistemas.esportes.combate;

import br.com.magna.sistemas.esportes.interfaces.Octogono;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class MuayThai extends Combate implements Octogono{

	@Override
	public String tipoDeRingue() {
		// TODO Auto-generated method stub
		return "Cage";
	}

}
