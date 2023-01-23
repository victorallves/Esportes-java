package br.com.magna.sistemas.esportes.taco;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeCriquete;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Taco;

public class Cricket extends Taco implements Campo {

	private EnumModalidadeDeCriquete ModalidadeDoCriquete;
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CRICKET_PITCH;
		
	}

	public EnumModalidadeDeCriquete getModalidadeDoCriquete() {
		return ModalidadeDoCriquete;
	}

	public void setModalidadeDoCriquete(EnumModalidadeDeCriquete modalidadeDoCriquete) {
		ModalidadeDoCriquete = modalidadeDoCriquete;
	}
	
	@Override
	public String toString() {
		return "Tipo de campo: " + getTipoCampo() + " " + "Criquete: " + tacada();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Cricket)) {
			Cricket obj2 = (Cricket) obj;
		    return this.ModalidadeDoCriquete.equals(obj2.getModalidadeDoCriquete());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeDoCriquete);
	}

}
