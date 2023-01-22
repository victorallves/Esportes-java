package br.com.magna.sistemas.esportes.rede;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeBadminton;
import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Rede;

public class Badminton extends Rede implements Quadra {

	private EnumModalidadeDeBadminton ModalidadeBadminton;
	
	public TipoQuadra getTipoQuadra() {
		return TipoQuadra.QUDRA_DE_BADMINTON ;
	}

	public EnumModalidadeDeBadminton getModalidadeBadminton() {
		return ModalidadeBadminton;
	}

	public void setModalidadeBadminton(EnumModalidadeDeBadminton modalidadeBadminton) {
		ModalidadeBadminton = modalidadeBadminton;
	}
	
	@Override
	public String toString() {
		return "Tipo de quadra: " + getTipoQuadra() + " " + "Badminton: " + saca() + ", " +  rebate() + ", " + bloqueia();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Badminton)) {
			Badminton obj2 = (Badminton) obj;
		    return this.ModalidadeBadminton.equals(obj2.getModalidadeBadminton());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeBadminton);
	}

}
