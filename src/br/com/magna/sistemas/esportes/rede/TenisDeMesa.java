package br.com.magna.sistemas.esportes.rede;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeTenisDeMesa;
import br.com.magna.sistemas.esportes.interfaces.Ginasio;
import br.com.magna.sistemas.esportes.modelo.Rede;

public class TenisDeMesa extends Rede implements Ginasio{

	private EnumModalidadeDeTenisDeMesa ModalidadeTenisDeMesa;
	
	public TipoGinasio getTipoGinasio() {
		return TipoGinasio.GINASIO_ARTISTICO;
		
	}

	public EnumModalidadeDeTenisDeMesa getModalidadeTenisDeMesa() {
		return ModalidadeTenisDeMesa;
	}

	public void setModalidadeTenisDeMesa(EnumModalidadeDeTenisDeMesa modalidadeTenisDeMesa) {
		ModalidadeTenisDeMesa = modalidadeTenisDeMesa;
	}
	
	@Override
	public String toString() {
		return "Tipo de ginasio: " + getTipoGinasio() + " " + "Tenis de mesa: " + saca() + ", " +  rebate() + ", " + bloqueia();
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof TenisDeMesa)) {
			TenisDeMesa obj2 = (TenisDeMesa) obj;
		    return this.ModalidadeTenisDeMesa.equals(obj2.getModalidadeTenisDeMesa());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeTenisDeMesa);
	}
}
