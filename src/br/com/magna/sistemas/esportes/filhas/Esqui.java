package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Montanha;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Esqui extends Marca implements Montanha{

	public String deslizar() {
		return "deslizando";
	}

	@Override
	public String tipoDeEscalada() {
		// TODO Auto-generated method stub
		return "Esqui alpino";
	}

	@Override
	public String tipoDeMontanha() {
		// TODO Auto-generated method stub
		return "montanha nevada";
	}
	
}
