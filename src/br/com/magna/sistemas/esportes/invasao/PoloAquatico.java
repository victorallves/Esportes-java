package br.com.magna.sistemas.esportes.invasao;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumFederacoesDePoloAquatico;
import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Invasao;

public class PoloAquatico extends Invasao implements Aquatico {
	
	private EnumFederacoesDePoloAquatico FederacoesDePoloAquatico;
	
	public EnumFederacoesDePoloAquatico getFederacoesDePoloAquatico() {
		return FederacoesDePoloAquatico;
	}

	public void setFederacoesDePoloAquatico(EnumFederacoesDePoloAquatico federacoesDePoloAquatico) {
		FederacoesDePoloAquatico = federacoesDePoloAquatico;
	}
	
	@Override
	public String nadar() {
		return "nadando";
	}

	@Override
	public String mergulhar() {
		return "mergulhando";
	}

	
	public LocalDaProva getLocalDaProva() {
		return LocalDaProva.PISCINA;
		
	}
	
	@Override
	public String toString() {
		return "local da prova: " + getLocalDaProva() + "Polo aquatico: " + ": " + getAtaque() + ", " +  arremessar() + ", " + ", " + nadar() + ", " + defender() + ", " + passarBola();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof PoloAquatico)) {
			PoloAquatico obj2 = (PoloAquatico) obj;
		    return this.FederacoesDePoloAquatico.equals(obj2.getFederacoesDePoloAquatico());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(FederacoesDePoloAquatico);
	
	}

	
}
