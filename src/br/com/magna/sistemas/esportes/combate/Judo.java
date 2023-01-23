package br.com.magna.sistemas.esportes.combate;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumEstilosDeJudo;
import br.com.magna.sistemas.esportes.interfaces.Ringue;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Judo extends Combate implements Ringue {
	
	private EnumEstilosDeJudo EstiloDeJudo;
	
	
	public TipoRingue getTipoRingue() {
		return Ringue.TipoRingue.TATAME;
		
	}


	public EnumEstilosDeJudo getEstiloDeJudo() {
		return EstiloDeJudo;
	}


	public void setEstiloDeJudo(EnumEstilosDeJudo estiloDeJudo) {
		EstiloDeJudo = estiloDeJudo;
	}


	@Override
	public String toString() {
		return "Tipo de Ringue: " + getTipoRingue() + " " + "judô: " + defenderGolpe() + ", " +  desviarGolpe() + ", "  + golpear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Judo)) {
			Judo obj2 = (Judo) obj;
		    return this.EstiloDeJudo.equals(obj2.getEstiloDeJudo());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(EstiloDeJudo);
	
	}
	
}
