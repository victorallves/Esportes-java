package br.com.magna.sistemas.esportes.precisao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeArco;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Precisao;

public class TiroArco extends Precisao implements Campo{

	private EnumTipoDeArco TipoDeArco;
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CAMPO_DE_TIRO;
		
	}

	public EnumTipoDeArco getTipoDeArco() {
		return TipoDeArco;
	}

	public void setTipoDeArco(EnumTipoDeArco tipoDeArco) {
		TipoDeArco = tipoDeArco;
	}

	@Override
	public String toString() {
		return "Tipo de campo: " + getTipoCampo() + " " + "Tiro ao arco: " + Mira() + ", " +  lancar() + ", " + alvo();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof TiroArco)) {
			TiroArco obj2 = (TiroArco) obj;
		    return this.TipoDeArco.equals(obj2.getTipoDeArco());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeArco);
	}
}
