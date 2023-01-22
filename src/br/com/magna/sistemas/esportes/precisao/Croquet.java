package br.com.magna.sistemas.esportes.precisao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeModalideCroquet;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Precisao;

public class Croquet extends Precisao implements Campo {

	private EnumTipoDeModalideCroquet TipoDeModalideCroquet;
	
	public EnumTipoDeModalideCroquet getTipoDeModalideCroquet() {
		return TipoDeModalideCroquet;
	}


	public void setTipoDeModalideCroquet(EnumTipoDeModalideCroquet tipoDeModalideCroquet) {
		TipoDeModalideCroquet = tipoDeModalideCroquet;
	}
	
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CAMPO_CROQUET;
		
	}


	@Override
	public String toString() {
		return "Tipo de campo: " + getTipoCampo() + " " + "Croquet: " + Mira() + ", " +  tacada() + ", " + alvo();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Croquet)) {
			Croquet obj2 = (Croquet) obj;
		    return this.TipoDeModalideCroquet.equals(obj2.getTipoDeModalideCroquet());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeModalideCroquet);
	}


	
}
