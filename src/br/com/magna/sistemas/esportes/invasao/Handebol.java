package br.com.magna.sistemas.esportes.invasao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeHandebol;
import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Handebol extends Invasao implements Quadra {

	private EnumTipoDeHandebol TipoDeHandebol;
	
	public TipoQuadra getTipoQuadra() {
		return TipoQuadra.QUADRA_DE_HANDBOL ;
	}

	public EnumTipoDeHandebol getTipoDeHandebol() {
		return TipoDeHandebol;
	}

	public void setTipoDeHandebol(EnumTipoDeHandebol tipoDeHandebol) {
		TipoDeHandebol = tipoDeHandebol;
	}
	

	@Override
	public String toString() {
		return "Tipo de Campo: " + getTipoQuadra() + "Handebol: " + ": " + getAtaque() + ", " +  chutar() + ", " + ", " + getDefesa() + ", " + defender();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Handebol)) {
			Handebol obj2 = (Handebol) obj;
		    return this.TipoDeHandebol.equals(obj2.getTipoDeHandebol());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeHandebol);
	
	}

}
