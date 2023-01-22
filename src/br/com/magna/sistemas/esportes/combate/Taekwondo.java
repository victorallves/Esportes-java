package br.com.magna.sistemas.esportes.combate;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumEstilosDeTaekwondo;
import br.com.magna.sistemas.esportes.interfaces.Ringue;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Taekwondo extends Combate implements Ringue{

	private EnumEstilosDeTaekwondo EstilosDeTaekwondo;
	
	
	public TipoRingue getTipoRingue() {
		return Ringue.TipoRingue.TATAME;
		
	}


	public EnumEstilosDeTaekwondo getEstilosDeTaekwondo() {
		return EstilosDeTaekwondo;
	}


	public void setEstilosDeTaekwondo(EnumEstilosDeTaekwondo estilosDeTaekwondo) {
		EstilosDeTaekwondo = estilosDeTaekwondo;
	}
	
	@Override
	public String toString() {
		return "Tipo de Ringue: " + getTipoRingue() + " " + "Taekwondo: " + defenderGolpe() + ", " +  desviarGolpe() + ", " + ", " + golpear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Taekwondo)) {
			Taekwondo obj2 = (Taekwondo) obj;
		    return this.EstilosDeTaekwondo.equals(obj2.getEstilosDeTaekwondo());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(EstilosDeTaekwondo);
	
	}

}
