package br.com.magna.sistemas.esportes.interfaces;

public interface Aquatico {
	
	public String nadar();
	public String mergulhar();
	
	public static enum LocalDaProva {
        
		MAR,
		PISCINA;
	
    }
	
}
