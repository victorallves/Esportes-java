package br.com.magna.sistemas.esportes.tecnico;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeSurf;
import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class Surf extends Tecnico implements Aquatico{
	
	private EnumModalidadeDeSurf ModalidadesDeSurf;
	
	public String pegarOnda() {
		return "pegou onda";
	}

	@Override
	public String nadar() {
		return "surfista nadou até a onda";
	}

	@Override
	public String mergulhar() {
		return "levou caldo";
	}
	
	
	public LocalDaProva getLocalDaProva() {
		return LocalDaProva.MAR;
		
	}

	public EnumModalidadeDeSurf getModalidadesDeSurf() {
		return ModalidadesDeSurf;
	}

	public void setModalidadesDeSurf(EnumModalidadeDeSurf modalidadesDeSurf) {
		ModalidadesDeSurf = modalidadesDeSurf;
	}
	
	@Override
	public String toString() {
		return "local da prova: " + getLocalDaProva() + " " + "Surf: "  + equilibrar() + ", " + saltar() + ", " + manobra() ;
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Surf)) {
			Surf obj2 = (Surf) obj;
		    return this.ModalidadesDeSurf.equals(obj2.getModalidadesDeSurf());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadesDeSurf);
	}
	
}
