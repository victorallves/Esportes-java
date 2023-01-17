package br.com.magna.sistemas.esportes.modelo;

public abstract class Esportes {

	private Integer pontuacao;
	private Integer tempoDeJogoEmMin;
	private String ligas;
	private String equipes;
	private String regras;	
	private String equipamento;
	private Integer numeroDeJogadores;

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Integer getTempoDeJogoEmMin() {
		return tempoDeJogoEmMin;
	}

	public void setTempoDeJogoEmMin(Integer tempoDeJogoEmMin) {
		this.tempoDeJogoEmMin = tempoDeJogoEmMin;
	}

	public void setNumeroDeJogadores(Integer numeroDeJogadores) {
		this.numeroDeJogadores = numeroDeJogadores;
	}

	public Integer getNumeroDeJogadores() {
		return numeroDeJogadores;
	}

	public String getLigas() {
		return ligas;
	}

	public void setLigas(String ligas) {
		this.ligas = ligas;
	}

	public String getEquipes() {
		return equipes;
	}

	public void setEquipes(String equipes) {
		this.equipes = equipes;
	}

	public String getRegras() {
		return regras;
	}

	public void setRegras(String regras) {
		this.regras = regras;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

}
