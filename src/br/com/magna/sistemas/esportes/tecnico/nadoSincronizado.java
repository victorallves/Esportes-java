package br.com.magna.sistemas.esportes.tecnico;

import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class nadoSincronizado extends Tecnico implements Aquatico {

	public String sincronizarMovimentos() {
		return "sincronia";
	}

	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "nadar em sincronia com o grupo";
	}

	@Override
	public String mergulhar() {
		// TODO Auto-generated method stub
		return "movimentos em baixo da agua";
	}
	
}
