package br.com.magna.sistemas.esportes.precisao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumCategoriaCurling;
import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Precisao;

public class Curling extends Precisao implements Pista{

	private EnumCategoriaCurling CategoriaCurling;
	
	public String varrer() {
		return "varrendo";
	}

	public TipoPista getTipoPista() {
		return Pista.TipoPista.PISTA_DE_GELO;
	}

	public EnumCategoriaCurling getCategoriaCurling() {
		return CategoriaCurling;
	}

	public void setCategoriaCurling(EnumCategoriaCurling categoriaCurling) {
		CategoriaCurling = categoriaCurling;
	}
	
	@Override
	public String toString() {
		return "Tipo de pista: " + getTipoPista() + " " + "Curling: " + Mira() + ", " +  tacada() + ", " + alvo();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Curling)) {
			Curling obj2 = (Curling) obj;
		    return this.CategoriaCurling.equals(obj2.getCategoriaCurling());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(CategoriaCurling);
	}
	
}
