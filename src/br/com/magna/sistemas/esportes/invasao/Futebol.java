package br.com.magna.sistemas.esportes.invasao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeModalidadeFutebol;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Futebol extends Invasao implements Campo {

	private EnumTipoDeModalidadeFutebol TipoDeModalidadeFutebol;
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CAMPO_FUTEBOL;
		
	}

	public EnumTipoDeModalidadeFutebol getTipoDeModalidadeFutebol() {
		return TipoDeModalidadeFutebol;
	}

	public void setTipoDeModalidadeFutebol(EnumTipoDeModalidadeFutebol tipoDeModalidadeFutebol) {
		TipoDeModalidadeFutebol = tipoDeModalidadeFutebol;
	}


	@Override
	public String toString() {
		return "Tipo de Campo: " + getTipoCampo() + " " + "Futebol: " + getAtaque() + ", " +  chutar() + ", " + ", " + getDefesa() + ", " + defender();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Futebol)) {
			Futebol obj2 = (Futebol) obj;
		    return this.TipoDeModalidadeFutebol.equals(obj2.getTipoDeModalidadeFutebol());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeModalidadeFutebol);
	
	}
	
}	
