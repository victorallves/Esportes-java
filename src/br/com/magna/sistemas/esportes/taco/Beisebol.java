package br.com.magna.sistemas.esportes.taco;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumConferenciaDeBeisebol;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Taco;

public class Beisebol extends Taco implements Campo  {

	private EnumConferenciaDeBeisebol ConferenciaDeBeisebol; 
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CAMPO_BEISEBOL;
		
	}

	public EnumConferenciaDeBeisebol getConferenciaDeBeisebol() {
		return ConferenciaDeBeisebol;
	}

	public void setConferenciaDeBeisebol(EnumConferenciaDeBeisebol conferenciaDeBeisebol) {
		ConferenciaDeBeisebol = conferenciaDeBeisebol;
	}
	
	@Override
	public String toString() {
		return "Tipo de campo: " + getTipoCampo() + " " + "Beisebol: " + tacada();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Beisebol)) {
			Beisebol obj2 = (Beisebol) obj;
		    return this.ConferenciaDeBeisebol.equals(obj2.getConferenciaDeBeisebol());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ConferenciaDeBeisebol);
	}
	
}