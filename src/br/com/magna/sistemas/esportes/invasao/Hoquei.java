package br.com.magna.sistemas.esportes.invasao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeHoquei;
import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Hoquei extends Invasao implements Pista {

	private EnumTipoDeHoquei TipoDeHoquei;
	
	public String patinar() {
		return "patinando";
	}
	
	public String trombar() {
		return "trombou";
	}

	public TipoPista getTipoPista() {
		return Pista.TipoPista.PISTA_DE_GELO;
	}

	public EnumTipoDeHoquei getTipoDeHoquei() {
		return TipoDeHoquei;
	}

	public void setTipoDeHoquei(EnumTipoDeHoquei tipoDeHoquei) {
		TipoDeHoquei = tipoDeHoquei;
	}
	
	@Override
	public String toString() {
		return "Tipo de Pista: " + getTipoPista() + " Hoquei: " + getAtaque() + ", " +  trombar() + ", "  + patinar() + ", " + defender() + ", " + passarBola() + ", " + chutar();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Hoquei)) {
			Hoquei obj2 = (Hoquei) obj;
		    return this.TipoDeHoquei.equals(obj2.getTipoDeHoquei());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeHoquei);
	
	}
	
}
