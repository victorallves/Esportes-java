package br.com.magna.sistemas.esportes.marca;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeEscalada;
import br.com.magna.sistemas.esportes.interfaces.Montanha;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Escalada extends Marca implements Montanha{

	private EnumTipoDeEscalada TipoDeEscalada;
	
	public EnumTipoDeEscalada getTipoDeEscalada() {
		return TipoDeEscalada;
	}

	public void setTipoDeEscalada(EnumTipoDeEscalada tipoDeEscalada) {
		TipoDeEscalada = tipoDeEscalada;
	}
	
	public TipoDeMontanha getTipoDeMontanha() {
		return TipoDeMontanha.MONTANHA_ROCHOSA;
	}

	public String pendurar() {
		return "pendurando";
	}
	
	public String escalar() {
		return "escalando";
	}

	@Override
	public String toString() {
		return "Tipo da Montanha: " + getTipoDeMontanha() + " " + "Escalada: " +  pendurar() + ", " +  escalar() + ", "  + baterMeta();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Escalada)) {
			Escalada obj2 = (Escalada) obj;
		    return this.TipoDeEscalada.equals(obj2.getTipoDeEscalada());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeEscalada);
	}
	
	
}
