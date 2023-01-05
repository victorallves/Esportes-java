package br.com.magna.sistemas.esportes.teste;

import br.com.magna.sistemas.esportes.modelo.Esportes;

public class Principal {

	public static void main(String[] args) {
	
		Esportes e = new Esportes();
		
		e.setEquipamento("taco");
		
		System.out.println(e.getEquipamento());
		
		
	}

}
