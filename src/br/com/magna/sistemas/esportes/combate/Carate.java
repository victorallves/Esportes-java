package br.com.magna.sistemas.esportes.combate;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumEstilosDeCarate;
import br.com.magna.sistemas.esportes.interfaces.Ringue;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Carate extends Combate implements Ringue{

	private EnumEstilosDeCarate EstiloDeCarate;
	
	public EnumEstilosDeCarate getEstiloDeCarate() {
		return EstiloDeCarate;
	}

	public void setEstiloDeCarate(EnumEstilosDeCarate estiloDeCarate) {
		EstiloDeCarate = estiloDeCarate;
	}
	
	public TipoRingue getTipoRingue() {
		return Ringue.TipoRingue.KOTO;
		
	}
	
	@Override
	public String toString() {
		return "Tipo de Ringue: " + getTipoRingue() + " " + "Carate: " + defenderGolpe() + ", " +  desviarGolpe() + ", " + ", " + golpear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Carate)) {
			Carate obj2 = (Carate) obj;
		    return this.EstiloDeCarate.equals(obj2.getEstiloDeCarate());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(EstiloDeCarate);
	}

	
	
	
}
