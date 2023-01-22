package br.com.magna.sistemas.esportes.rede;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeFutvolei;
import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Rede;

public class Futvolei extends Rede implements Quadra{

	private EnumModalidadeDeFutvolei ModalidadeFutvolei;
	
	public TipoQuadra getTipoQuadra() {
		return TipoQuadra.QUADRA_DE_FUTVOLEI ;
	}

	public EnumModalidadeDeFutvolei getModalidadeFutvolei() {
		return ModalidadeFutvolei;
	}

	public void setModalidadeFutvolei(EnumModalidadeDeFutvolei modalidadeFutvolei) {
		ModalidadeFutvolei = modalidadeFutvolei;
	}
	
	@Override
	public String toString() {
		return "Tipo de quadra: " + getTipoQuadra() + " " + "Futvolei: " + saca() + ", " +  rebate() + ", " + bloqueia();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Futvolei)) {
			Futvolei obj2 = (Futvolei) obj;
		    return this.ModalidadeFutvolei.equals(obj2.getModalidadeFutvolei());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeFutvolei);
	}
}
