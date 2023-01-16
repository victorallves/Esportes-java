package br.com.magna.sistemas.esportes.marca;

import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Ciclismo extends Marca implements Pista{

	public String pedalar() {
		return "pedalando";
	}
	
	public String freiar() {
		return "freiando";
	}
	
	public String conduzir() {
		return "conduzindo";
	}

	@Override
	public String tipoDePista() {
		// TODO Auto-generated method stub
		return "Velódromo";
	}
	
}
