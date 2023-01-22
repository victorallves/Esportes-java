package br.com.magna.sistemas.esportes.tecnico;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTiposDeSaltoOrnamental;
import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class SaltosOrnamentais extends Tecnico implements Aquatico {

	private EnumTiposDeSaltoOrnamental TiposDeSaltoOrnamental;
	
	@Override
	public String nadar() {
		return "nadando até a borda da piscina";
	}

	@Override
	public String mergulhar() {
		return "mergulhou";
	}
	
	public LocalDaProva getLocalDaProva() {
		return LocalDaProva.PISCINA;
		
	}

	public EnumTiposDeSaltoOrnamental getTiposDeSaltoOrnamental() {
		return TiposDeSaltoOrnamental;
	}

	public void setTiposDeSaltoOrnamental(EnumTiposDeSaltoOrnamental tiposDeSaltoOrnamental) {
		TiposDeSaltoOrnamental = tiposDeSaltoOrnamental;
	}
	
	@Override
	public String toString() {
		return "local da prova: " + getLocalDaProva() + " " + "Saltos Ornamentais: "  + equilibrar() + ", " + saltar() + ", " + manobra() ;
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof SaltosOrnamentais)) {
			SaltosOrnamentais obj2 = (SaltosOrnamentais) obj;
		    return this.TiposDeSaltoOrnamental.equals(obj2.getTiposDeSaltoOrnamental());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TiposDeSaltoOrnamental);
	}

}
