package br.com.magna.sistemas.esportes.rede;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeTenis;
import br.com.magna.sistemas.esportes.interfaces.Quadra;
import br.com.magna.sistemas.esportes.modelo.Rede;

public class Tenis extends Rede implements Quadra{

	private EnumModalidadeDeTenis ModalidadeTenis;
	
	public TipoQuadra getTipoQuadra() {
		return TipoQuadra.QUADRA_DE_TENIS ;
	}

	public EnumModalidadeDeTenis getModalidadeTenis() {
		return ModalidadeTenis;
	}

	public void setModalidadeTenis(EnumModalidadeDeTenis modalidadeTenis) {
		ModalidadeTenis = modalidadeTenis;
	}

	@Override
	public String toString() {
		return "Tipo de quadra: " + getTipoQuadra() + " " + "Tenis: " + saca() + ", " +  rebate() + ", " + bloqueia();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Tenis)) {
			Tenis obj2 = (Tenis) obj;
		    return this.ModalidadeTenis.equals(obj2.getModalidadeTenis());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeTenis);
	}
}
