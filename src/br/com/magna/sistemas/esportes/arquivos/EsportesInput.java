package br.com.magna.sistemas.esportes.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer; 

public class EsportesInput {

	public static void main(String[] args) throws  IOException {
	
	                  
	      InputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Esportes\\src\\br\\com\\magna\\sistemas\\esportes\\arquivos\\Esportes.csv");
	      Reader isr = new InputStreamReader(fis,"UTF-8");
	      BufferedReader br = new BufferedReader(isr);

	      OutputStream fos = new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\Esportes\\src\\br\\com\\magna\\sistemas\\esportes\\arquivos\\Esportes.txt");
	      Writer osw = new OutputStreamWriter(fos,"UTF-8");
	      BufferedWriter bfw = new BufferedWriter(osw);
	      
	      
	      String linha = br.readLine();
	      
	      while(linha != null) {
	    	  bfw.write(linha);;
	    	  bfw.newLine();
	    	  linha = br.readLine();
	      }
	      
	      
	      br.close();
	      bfw.close();
	      
	    
	}
}


//Scanner scanner = new Scanner(arquivo);

//while (scanner.hasNextLine()) {
 // String linha = scanner.nextLine();
//  System.out.println(linha);
//}

//scanner.close();
