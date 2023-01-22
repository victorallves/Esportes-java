package br.com.magna.sistemas.esportes.tecnico;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumModalidadeDePatinacaoArtistica;
import br.com.magna.sistemas.esportes.interfaces.Pista;
import br.com.magna.sistemas.esportes.modelo.Tecnico;

public class PatinacaoArtistica extends Tecnico implements Pista{

	private EnumModalidadeDePatinacaoArtistica ModalidadePatinacaoArtistica;
	
	public String girar() {
		return "girando";
	}
	
	public String patinar() {
		return "patinando";
	}

	public TipoPista getTipoPista() {
		return Pista.TipoPista.PISTA_DE_GELO;
	}

	public EnumModalidadeDePatinacaoArtistica getModalidadePatinacaoArtistica() {
		return ModalidadePatinacaoArtistica;
	}

	public void setModalidadePatinacaoArtistica(EnumModalidadeDePatinacaoArtistica modalidadePatinacaoArtistica) {
		ModalidadePatinacaoArtistica = modalidadePatinacaoArtistica;
	}
	
	@Override
	public String toString() {
		return "tipo de pista: " + getTipoPista() + " " + "Patinação Artistica: "  + equilibrar() + ", " + saltar() + ", " + manobra() ;
	}


	@Override
	public boolean equals(Object obj) {
		if((obj instanceof PatinacaoArtistica)) {
			PatinacaoArtistica obj2 = (PatinacaoArtistica) obj;
		    return this.ModalidadePatinacaoArtistica.equals(obj2.getModalidadePatinacaoArtistica());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalidadePatinacaoArtistica);
	}
	
}
