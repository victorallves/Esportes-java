package br.com.magna.sistemas.esportes.filhas;

import br.com.magna.sistemas.esportes.interfaces.Montanha;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Escalada extends Marca implements Montanha{

	public String pendurar() {
		return "pendurado";
	}
	
	public String escalar() {
		return "escalando";
	}

	@Override
	public String tipoDeEscalada() {
		// TODO Auto-generated method stub
		return "Alpinismo Tradicional";
	}

	@Override
	public String tipoDeMontanha() {
		// TODO Auto-generated method stub
		return "montanha rochosa";
	}
}
