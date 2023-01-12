package br.com.magna.sistemas.esportes.modelo;

public class Rede extends Esportes {

	Integer sets;
	String rede;
	
	
	public Integer getSets() {
		return sets;
	}

	public void setSets(Integer sets) {
		this.sets = sets;
	}

	public String getRede() {
		return rede;
	}

	public void setRede(String rede) {
		this.rede = rede;
	}

	public String saca() {
		return "saque efetuado";
	}
	
	public String bloqueia() {
		return "bloqueou";
	}
	
	public String rebate() {
		return "rebateu";
	}
	
}
