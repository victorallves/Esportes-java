package br.com.magna.sistemas.esportes.teste;

import br.com.magna.sistemas.esportes.filhas.Basquete;
import br.com.magna.sistemas.esportes.filhas.Futebol;
import br.com.magna.sistemas.esportes.filhas.Surf;

public class Principal {

	public static void main(String[] args) {

		Futebol futebol = new Futebol();
		
		System.out.println(futebol.tipoDeCampo());
		System.out.println(futebol.driblar());
		System.out.println(futebol.chutar());

		System.out.println("------------------");

		Surf surf = new Surf();
		
		System.out.println(surf.nadar());
		System.out.println(surf.equilibrar());
		System.out.println(surf.pegarOnda());
		
		System.out.println("------------------");
		
		Basquete basquete = new Basquete();
		System.out.println(basquete.tipoDeQuadra());
		System.out.println(basquete.arremessar());
		System.out.println(basquete.bloquear());
		System.out.println(basquete.driblar());
	}

}
