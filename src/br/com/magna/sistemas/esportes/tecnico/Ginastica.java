package br.com.magna.sistemas.esportes.tecnico;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeGinastica;
import br.com.magna.sistemas.esportes.interfaces.Ginasio;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class Ginastica extends Tecnico implements Ginasio{

	private EnumTipoDeGinastica TipoDeGinastica;
	
	public TipoGinasio getTipoGinasio() {
		return TipoGinasio.GINASIO_ARTISTICO;
		
	}

	public EnumTipoDeGinastica getTipoDeGinastica() {
		return TipoDeGinastica;
	}

	public void setTipoDeGinastica(EnumTipoDeGinastica tipoDeGinastica) {
		TipoDeGinastica = tipoDeGinastica;
	}
	
	@Override
	public String toString() {
		return "Tipo de ginasio: " + getTipoGinasio() + " " + "Ginastica: " + getTipoDeGinastica() + ", " + equilibrar() + ", " + saltar() + ", " + manobra() ;
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Ginastica)) {
			Ginastica obj2 = (Ginastica) obj;
		    return this.TipoDeGinastica.equals(obj2.getTipoDeGinastica());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeGinastica);
	}

}
