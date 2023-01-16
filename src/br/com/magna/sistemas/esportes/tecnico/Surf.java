package br.com.magna.sistemas.esportes.tecnico;

import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class Surf extends Tecnico implements Aquatico{
	
	public String pegarOnda() {
		return "pegou onda";
	}

	@Override
	public String nadar() {
		return "surfista nadou até a onda";
	}

	@Override
	public String mergulhar() {
		return "levou caldo";
	}
	
}
