package _5_1_i_o;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Teste {

	public static void main(String[] args) throws IOException {
		
		String localArquivo= "C:\\Users\\Top\\teste_entrega9\\exerc08\\src\\_5_1_i_o\\file.txt";
		
		InputStream is = new FileInputStream(localArquivo);
		
		IOFacade ioFacade = new IOFacade(is);
		
		ioFacade.ReadFile();
		

	}

}
