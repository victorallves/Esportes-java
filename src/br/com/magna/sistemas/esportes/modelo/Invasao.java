package br.com.magna.sistemas.esportes.modelo;

public class Invasao extends Esportes {

	String ataque;
	String defesa;
	Integer placar;
	String gol;
	String tabela;
	
	public String getAtaque() {
		return ataque;
	}

	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}

	public String getDefesa() {
		return defesa;
	}

	public void setDefesa(String defesa) {
		this.defesa = defesa;
	}

	public Integer getPlacar() {
		return placar;
	}

	public void setPlacar(Integer placar) {
		this.placar = placar;
	}

	public String getGol() {
		return gol;
	}

	public void setGol(String gol) {
		this.gol = gol;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public String chutar() {
		return "chute";
	}
	
	public String arremessar() {
		return "arremessou";
	}
	
	public String driblar() {
		return "driblou";
	}
	
	public String defender() {
		return "defendeu";
	}
	
	public String passarBola() {
		return "passou";
	}
	
}
