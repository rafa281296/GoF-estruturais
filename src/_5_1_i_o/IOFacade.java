package _5_1_i_o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOFacade {
	
	private final InputStream is;
	
	public IOFacade(InputStream inputStream) {
		this.is = inputStream;
	}
	
	public void ReadFile() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String y = br.readLine();
		
		while (y != null) {
			
			System.out.println(y);
            y = br.readLine();
			
		}
		
		br.close();
		
	}

}
