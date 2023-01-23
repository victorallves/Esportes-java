package br.com.magna.sistemas.esportes.marca;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeAtletismo;
import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Atletismo extends Marca implements Pista{

	private EnumTipoDeAtletismo	TipoDeAtletismo;
	
	public EnumTipoDeAtletismo getTipoDeAtletismo() {
		return TipoDeAtletismo;
	}

	public void setTipoDeAtletismo(EnumTipoDeAtletismo tipoDeAtletismo) {
		TipoDeAtletismo = tipoDeAtletismo;
	}
	
	public String correr() {
		return "correndo";
	}
	
	public String pular() {
		return "pulando";
	}
	
	public String arremessar() {
		return "arremessou";
	}

	public TipoPista getTipoPista() {
		return Pista.TipoPista.PISTA_DE_ATLETISMO;
	}
	
	@Override
	public String toString() {
		return "Tipo da Pista: " + getTipoPista() + " " + "Atletismo: " +  correr() + ", " +  pular() + ", "  + arremessar() +  ", " + baterMeta();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Atletismo)) {
			Atletismo obj2 = (Atletismo) obj;
		    return this.TipoDeAtletismo.equals(obj2.getTipoDeAtletismo());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeAtletismo);
	}
	
	
}
