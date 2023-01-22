package br.com.magna.sistemas.esportes.invasao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeBasquete;
import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Basquete extends Invasao implements Quadra {
	
	private EnumModalidadeDeBasquete TipoDeModalidadeBasquete;
	
	public EnumModalidadeDeBasquete getTipoDeModalidadeBasquete() {
		return TipoDeModalidadeBasquete;
	}

	public void setTipoDeModalidade(EnumModalidadeDeBasquete tipoDeModalidade) {
		TipoDeModalidadeBasquete = tipoDeModalidade;
	}
	
	public String bloquear() {
		return "bloqueado";
	}
	
	public String enterrar() {
		return "enterrou";
	}


	public TipoQuadra getTipoQuadra() {
		return TipoQuadra.QUADRA_DE_BASQUETE ;
	}

	@Override
	public String toString() {
		return "Tipo de quadra: " + getTipoQuadra() + " " + "basquete: " + getAtaque() + ", " +  enterrar() + ", " + ", " + getDefesa() + ", " + bloquear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Basquete)) {
			Basquete obj2 = (Basquete) obj;
		    return this.TipoDeModalidadeBasquete.equals(obj2.getTipoDeModalidadeBasquete());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeModalidadeBasquete);
	}
}
