package br.com.magna.sistemas.esportes.marca;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeEsqui;
import br.com.magna.sistemas.esportes.interfaces.Montanha;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Esqui extends Marca implements Montanha{

	private EnumTipoDeEsqui TipoDeEsqui;
	
	public EnumTipoDeEsqui getTipoDeEsqui() {
		return TipoDeEsqui;
	}


	public void setTipoDeEsqui(EnumTipoDeEsqui tipoDeEsqui) {
		TipoDeEsqui = tipoDeEsqui;
	}
	
	public String deslizar() {
		return "deslizando";
	}
	
	public String saltar() {
		return "salto";
	}
	
	
	public TipoDeMontanha getTipoDeMontanha() {
		return TipoDeMontanha.MONTANHA_NEVADA;
	}
	
	@Override
	public String toString() {
		return "Tipo da montanha: " + getTipoDeMontanha() + " " + "Esqui: " +  deslizar() + ", " +  saltar() + ", " + baterMeta();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Esqui)) {
			Esqui obj2 = (Esqui) obj;
		    return this.TipoDeEsqui.equals(obj2.getTipoDeEsqui());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeEsqui);
	}

	
}
