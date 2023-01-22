package br.com.magna.sistemas.esportes.marca;

import java.util.Objects;

import br.com.magna.sistemas.esportes.enums.EnumTipoDeNado;
import br.com.magna.sistemas.esportes.interfaces.Aquatico;
import br.com.magna.sistemas.esportes.modelo.Marca;

public class Natacao extends Marca implements Aquatico{

	private EnumTipoDeNado TipoDeNado;
	
	public EnumTipoDeNado getTipoDeNado() {
		return TipoDeNado;
	}

	public void setTipoDeNado(EnumTipoDeNado tipoDeNado) {
		TipoDeNado = tipoDeNado;
	}
	
	public String viradaOlimpica() {
		return "giro para o lado oposto";
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
		return "local da prova: " + getLocalDaProva() + " " + "natação: " +  mergulhar() + ", " +  nadar() + ", " + baterMeta();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Natacao)) {
			Natacao obj2 = (Natacao) obj;
		    return this.TipoDeNado.equals(obj2.getTipoDeNado());
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(TipoDeNado);
	}
	

}
