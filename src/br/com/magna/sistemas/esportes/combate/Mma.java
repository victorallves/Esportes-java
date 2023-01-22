package br.com.magna.sistemas.esportes.combate;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumEspecialidadeDoAtletaMma;
import br.com.magna.sistemas.esportes.interfaces.Ringue;
import br.com.magna.sistemas.esportes.modelo.Combate;

public class Mma extends Combate implements Ringue{

	private EnumEspecialidadeDoAtletaMma EspecialidadeAtleta;
	
	public TipoRingue getTipoRingue() {
		return Ringue.TipoRingue.CAGE;
		
	}

	public EnumEspecialidadeDoAtletaMma getEspecialidadeAtleta() {
		return EspecialidadeAtleta;
	}

	public void setEspecialidadeAtleta(EnumEspecialidadeDoAtletaMma especialidadeAtleta) {
		EspecialidadeAtleta = especialidadeAtleta;
	}
	
	@Override
	public String toString() {
		return "Tipo de Ringue: " + getTipoRingue() + " " + "MMA: " + defenderGolpe() + ", " +  desviarGolpe() + ", " + ", " + golpear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Mma)) {
			Mma obj2 = (Mma) obj;
		    return this.EspecialidadeAtleta.equals(obj2.getEspecialidadeAtleta());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(EspecialidadeAtleta);
	
	}
}
