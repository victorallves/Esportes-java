package br.com.magna.sistemas.esportes.marca;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeBicleta;
import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Ciclismo extends Marca implements Pista{
	
	private EnumTipoDeBicleta	TipoBicicleta;
	
	public EnumTipoDeBicleta getTipoBicicleta() {
		return TipoBicicleta;
	}

	public void setTipoBicicleta(EnumTipoDeBicleta tipoBicicleta) {
		this.TipoBicicleta = tipoBicicleta;
	}

	public TipoPista getTipoPista() {
		return Pista.TipoPista.VELODROMO;
	}
	
	
	public String pedalar() {
		return "pedalando";
	}
	
	public String freiar() {
		return "freiando";
	}
	
	public String conduzir() {
		return "conduzindo";
	}
	
	
	@Override
	public String toString() {
		return "Tipo da Pista: " + getTipoPista() + " " + "Ciclsimo: " +  pedalar() + ", " +  freiar() + ", " +  conduzir() + ", " + baterMeta();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Ciclismo)) {
			Ciclismo obj2 = (Ciclismo) obj;
		    return this.TipoBicicleta.equals(obj2.getTipoBicicleta());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoBicicleta);
	}
	
}
