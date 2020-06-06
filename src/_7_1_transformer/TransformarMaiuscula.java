package _7_1_transformer;

public class TransformarMaiuscula extends TransformaStringTemplate {
	
	@Override
	public void alterarString(String s) {
		
		s = s.toUpperCase();
		
		System.out.println("Convertido: " + s);
	
	}

}
