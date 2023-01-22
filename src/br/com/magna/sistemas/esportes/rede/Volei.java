package br.com.magna.sistemas.esportes.rede;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeVolei;
import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Rede;

public class Volei extends Rede implements Quadra {
	
	private EnumModalidadeDeVolei ModalidadeVolei;
	
	public TipoQuadra getTipoQuadra() {
		return TipoQuadra.QUADRA_DE_VOLEI ;
	}

	public EnumModalidadeDeVolei getModalidadeVolei() {
		return ModalidadeVolei;
	}

	public void setModalidadeVolei(EnumModalidadeDeVolei modalidadeVolei) {
		ModalidadeVolei = modalidadeVolei;
	}
	
	@Override
	public String toString() {
		return "Tipo de quadra: " + getTipoQuadra() + " " + "Volei: " + saca() + ", " +  rebate() + ", " + bloqueia();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Volei)) {
			Volei obj2 = (Volei) obj;
		    return this.ModalidadeVolei.equals(obj2.getModalidadeVolei());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeVolei);
	}
}
