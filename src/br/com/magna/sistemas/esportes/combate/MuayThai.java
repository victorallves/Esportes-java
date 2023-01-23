package br.com.magna.sistemas.esportes.combate;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumEstilosDeMuayThai;
import br.com.magna.sistemas.esportes.interfaces.Ringue;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class MuayThai extends Combate implements Ringue{

	private EnumEstilosDeMuayThai EstilosDeMuayThai;
	
	public TipoRingue getTipoRingue() {
		return Ringue.TipoRingue.CAGE;
		
	}

	public EnumEstilosDeMuayThai getEstilosDeMuayThai() {
		return EstilosDeMuayThai;
	}

	public void setEstilosDeMuayThai(EnumEstilosDeMuayThai estilosDeMuayThai) {
		EstilosDeMuayThai = estilosDeMuayThai;
	}

	@Override
	public String toString() {
		return "Tipo de Ringue: " + getTipoRingue() + " " + "Muay-Thai: " + defenderGolpe() + ", " +  desviarGolpe() + ", "  + golpear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof MuayThai)) {
			MuayThai obj2 = (MuayThai) obj;
		    return this.EstilosDeMuayThai.equals(obj2.getEstilosDeMuayThai());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(EstilosDeMuayThai);
	
	}
}
