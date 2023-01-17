package br.com.magna.sistemas.esportes.teste;

import br.com.magna.sistemas.esportes.invasao.Basquete;
import br.com.magna.sistemas.esportes.invasao.Futebol;
import br.com.magna.sistemas.esportes.modelo.Esportes;
import br.com.magna.sistemas.esportes.modelo.Invasao;
import br.com.magna.sistemas.esportes.precisao.Croquet;
import br.com.magna.sistemas.esportes.rede.Futvolei;
import br.com.magna.sistemas.esportes.tecnico.Surf;

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
		
		System.out.println("------------------");
		
		Futvolei futvolei = new Futvolei();
		futvolei.setNumeroDeJogadores(10);	
		System.out.println(futvolei.saca());
		System.out.println(futvolei.bloqueia());
		System.out.println(futvolei.rebate());
		System.out.println(futvolei.getNumeroDeJogadores());
		
		System.out.println("------------------");
		
		Croquet croquet = new Croquet();
		croquet.setAlvo("arco de ferro");
		System.out.println(croquet.getAlvo());
		System.out.println(croquet.tipoDeCampo());
		System.out.println(croquet.tacada());
		
	}
}
