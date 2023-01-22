package br.com.magna.sistemas.esportes.precisao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeGolfe;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Precisao;

public class Golfe extends Precisao implements Campo {

	private EnumModalidadeDeGolfe ModalidadeGolfe;
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CAMPO_GOLFE;
		
	}

	public EnumModalidadeDeGolfe getModalidadeGolfe() {
		return ModalidadeGolfe;
	}

	public void setModalidadeGolfe(EnumModalidadeDeGolfe modalidadeGolfe) {
		ModalidadeGolfe = modalidadeGolfe;
	}

	@Override
	public String toString() {
		return "Tipo de campo: " + getTipoCampo() + " " + "Golfe: " + Mira() + ", " +  tacada() + ", " + alvo();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Golfe)) {
			Golfe obj2 = (Golfe) obj;
		    return this.ModalidadeGolfe.equals(obj2.getModalidadeGolfe());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeGolfe);
	}

}
