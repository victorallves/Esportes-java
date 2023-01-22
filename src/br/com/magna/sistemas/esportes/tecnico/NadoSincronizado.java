package br.com.magna.sistemas.esportes.tecnico;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeNadoSincronizado;
import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class NadoSincronizado extends Tecnico implements Aquatico {

	private EnumModalidadeDeNadoSincronizado ModalidadeNadoSincronizado;
	
	
	public String sincronizarMovimentos() {
		return "sincronia";
	}

	@Override
	public String nadar() {
		return "nadar em sincronia com o grupo";
	}

	@Override
	public String mergulhar() {
		return "movimentos em baixo da agua";
	}
	
	
	public LocalDaProva getLocalDaProva() {
		return LocalDaProva.PISCINA;
		
	}

	public EnumModalidadeDeNadoSincronizado getModalidadeNadoSincronizado() {
		return ModalidadeNadoSincronizado;
	}

	public void setModalidadeNadoSincronizado(EnumModalidadeDeNadoSincronizado modalidadeNadoSincronizado) {
		ModalidadeNadoSincronizado = modalidadeNadoSincronizado;
	}
	
	@Override
	public String toString() {
		return "local da prova: " + getLocalDaProva() + " " + "Nado sincronizado: "  + equilibrar() + ", " + saltar() + ", " + manobra() ;
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof NadoSincronizado)) {
			NadoSincronizado obj2 = (NadoSincronizado) obj;
		    return this.ModalidadeNadoSincronizado.equals(obj2.getModalidadeNadoSincronizado());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadeNadoSincronizado);
	}

	
}
