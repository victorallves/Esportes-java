package br.com.magna.sistemas.esportes.teste;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeAtletismo;
import br.com.magna.sistemas.esportes.marca.Atletismo;

public abstract class Principal {
	
	public static void main(String[] args) {
		
	Atletismo atletismo = new Atletismo();
	Atletismo atletismo2 = new Atletismo();
	
	atletismo.setTipoDeAtletismo(EnumTipoDeAtletismo.MARCHA_ATLETICA);
	atletismo2.setTipoDeAtletismo(EnumTipoDeAtletismo.MARCHA_ATLETICA);
	
	System.out.println(atletismo.hashCode());
	System.out.println(atletismo2.hashCode());
	
	
	
		
	}

}
