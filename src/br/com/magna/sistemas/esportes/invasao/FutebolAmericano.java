package br.com.magna.sistemas.esportes.invasao;


import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumConferenciasDeFutebolAmericano;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Invasao;


public class FutebolAmericano extends Invasao implements Campo {

	private EnumConferenciasDeFutebolAmericano  ConferenciaDeFutebolAmericano;
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CAMPO_FUTEBOL_AMERICANO;
		
	}

	public EnumConferenciasDeFutebolAmericano getConferenciaDeFutebolAmericano() {
		return ConferenciaDeFutebolAmericano;
	}

	public void setConferenciaDeFutebolAmericano(EnumConferenciasDeFutebolAmericano conferenciaDeFutebolAmericano) {
		ConferenciaDeFutebolAmericano = conferenciaDeFutebolAmericano;
	}


	@Override
	public String toString() {
		return "Tipo de Campo: " + getTipoCampo() + " " + "Futebol Americano: " + getAtaque() + ", " +  chutar() + ", " + ", " + getDefesa() + ", " + defender();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof FutebolAmericano)) {
			FutebolAmericano obj2 = (FutebolAmericano) obj;
		    return this.ConferenciaDeFutebolAmericano.equals(obj2.getConferenciaDeFutebolAmericano());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ConferenciaDeFutebolAmericano);
	
	}
	
}
