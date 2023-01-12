package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Basquete extends Invasao implements Quadra {
	
	private final String nomeEsporte = "Basquete";

	public String bloquear() {
		return "bloqueado";
	}
	
	public String enterrar() {
		return "enterrou";
	}

	@Override
	public String especificacaoQuadra() {
		return "Quadra de " + nomeEsporte;
	}
	
}
