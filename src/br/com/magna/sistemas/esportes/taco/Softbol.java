package br.com.magna.sistemas.esportes.taco;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTiposDeSoftbol;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Taco;

public class Softbol extends Taco implements Campo{

	private EnumTiposDeSoftbol TiposDeSoftbol;
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CAMPO_SOFTBOL;
		
	}

	public EnumTiposDeSoftbol getTiposDeSoftbol() {
		return TiposDeSoftbol;
	}

	public void setTiposDeSoftbol(EnumTiposDeSoftbol tiposDeSoftbol) {
		TiposDeSoftbol = tiposDeSoftbol;
	}

	@Override
	public String toString() {
		return "Tipo de campo: " + getTipoCampo() + " " + "Softbol: " + tacada();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Softbol)) {
			Softbol obj2 = (Softbol) obj;
		    return this.TiposDeSoftbol.equals(obj2.getTiposDeSoftbol());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TiposDeSoftbol);
	}

}
