package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Natacao extends Marca implements Aquatico{

	
	public String viradaOlimpica() {
		return "giro para o lado oposto";
	}
	
	
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
