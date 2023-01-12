package br.com.magna.sistemas.esportes.modelo;

public class Taco extends Esportes {

	String rebatedor;
	String lancador;
	String base;

	public String getRebatedor() {
		return rebatedor;
	}

	public void setRebatedor(String rebatedor) {
		this.rebatedor = rebatedor;
	}

	public String getLancador() {
		return lancador;
	}

	public void setLancador(String lancador) {
		this.lancador = lancador;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String tacada() {
		return "tacada realizada";
	}

}
