package br.com.magna.sistemas.esportes.combate;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeEsgrima;
import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Esgrima extends Combate implements Pista{

	private EnumTipoDeEsgrima TipoDeEsgrima;
	
	
	public TipoPista getTipoPista() {
		return Pista.TipoPista.PISTA_DE_ESGRIMA;
	}


	public EnumTipoDeEsgrima getTipoDeEsgrima() {
		return TipoDeEsgrima;
	}


	public void setTipoDeEsgrima(EnumTipoDeEsgrima tipoDeEsgrima) {
		TipoDeEsgrima = tipoDeEsgrima;
	}
	
	@Override
	public String toString() {
		return "Tipo de Ringue: " + getTipoPista() + " " + "esgrima: " + defenderGolpe() + ", " +  desviarGolpe() + ", " + ", " + golpear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Esgrima)) {
			Esgrima obj2 = (Esgrima) obj;
		    return this.TipoDeEsgrima.equals(obj2.getTipoDeEsgrima());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeEsgrima);
	}
}
