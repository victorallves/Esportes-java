package br.com.magna.sistemas.esportes.invasao;

import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Basquete extends Invasao implements Quadra {
	

	public String bloquear() {
		return "bloqueado";
	}
	
	public String enterrar() {
		return "enterrou";
	}

	@Override
	public String tipoDeQuadra() {
		return "Quadra de Basquete ";
	}
	
}
