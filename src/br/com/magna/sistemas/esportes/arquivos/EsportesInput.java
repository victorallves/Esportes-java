package br.com.magna.sistemas.esportes.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner; 

public class EsportesInput {

	public static void main(String[] args) throws  IOException {
	
	      File myObj = new File("C:\\dev\\workspaces\\Esportes-java\\src\\br\\com\\magna\\sistemas\\esportes\\arquivos\\Esportes.csv");
	      
	      Scanner myReader = new Scanner(myObj);
	      
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      
	      myReader.close();
	      
	}
}
