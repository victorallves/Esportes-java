package br.com.magna.sistemas.esportes.invasao;

import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class PoloAquatico extends Invasao implements Aquatico {

	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "nadando";
	}

	@Override
	public String mergulhar() {
		// TODO Auto-generated method stub
		return "mergulhando";
	}

}
