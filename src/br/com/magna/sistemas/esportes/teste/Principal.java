package br.com.magna.sistemas.esportes.teste;

import br.com.magna.sistemas.esportes.modelo.Invasao;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class Principal {

	public static void main(String[] args) {

		Invasao futebol = new Invasao();
		
		futebol.setEquipamento("chuteira");
		futebol.setNumeroDeJogadores(11);
		
		System.out.println("futebol");
		System.out.println(futebol.getEquipamento());
		System.out.println(futebol.getNumeroDeJogadores());
		System.out.println(futebol.chutar());
		
		System.out.println("------------------");
		
		Tecnico surf = new Tecnico();
		System.out.println("surf");
		System.out.println(surf.nadar());
		System.out.println(surf.equilibrar());
		
		
	}

}
