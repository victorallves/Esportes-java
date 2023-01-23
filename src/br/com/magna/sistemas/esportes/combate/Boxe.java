package br.com.magna.sistemas.esportes.combate;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeBoxe;
import br.com.magna.sistemas.esportes.interfaces.Ringue;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Boxe extends Combate implements Ringue {

	
	private EnumTipoDeBoxe TipoDeBoxe;
	
	public EnumTipoDeBoxe getTipoDeBoxe() {
		return TipoDeBoxe;
	}

	public void setTipoDeBoxe(EnumTipoDeBoxe tipoDeBoxe) {
		TipoDeBoxe = tipoDeBoxe;
	}
	
	public TipoRingue getTipoRingue() {
		return Ringue.TipoRingue.OCTOGONO;
		
	}
	
	@Override
	public String toString() {
		return "Tipo de Ringue: " + getTipoRingue() + " " + "Boxe: " + defenderGolpe() + ", " +  desviarGolpe() + ", " + golpear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Boxe)) {
			Boxe obj2 = (Boxe) obj;
		    return this.TipoDeBoxe.equals(obj2.getTipoDeBoxe());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeBoxe);
	}


}
