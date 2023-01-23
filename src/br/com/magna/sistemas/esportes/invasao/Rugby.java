package br.com.magna.sistemas.esportes.invasao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeRugby;
import br.com.magna.sistemas.esportes.interfaces.Campo;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class Rugby extends Invasao implements Campo {

	private EnumModalidadeDeRugby ModalidadeRugby;
	
	
	public TipoCampo getTipoCampo() {
		return Campo.TipoCampo.CAMPO_RUGBY;
		
	}

	public EnumModalidadeDeRugby getModalidadeRugby() {
		return ModalidadeRugby;
	}

	public void setModalidadeRugby(EnumModalidadeDeRugby modalidadeRugby) {
		ModalidadeRugby = modalidadeRugby;
	}

	@Override
	public String toString() {
		return "campo: " + getTipoCampo() + "Rugby: " + ": " + getAtaque() + ", " +  arremessar() + ", " + ", " + chutar() + ", " + defender() + ", " + passarBola();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Rugby)) {
			Rugby obj2 = (Rugby) obj;
		    return this.ModalidadeRugby.equals(obj2.getModalidadeRugby());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeRugby);
	
	}
}
