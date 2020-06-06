package _7_1_transformer;

public class TransformarMinuscula extends TransformaStringTemplate {
	
	@Override
	public void alterarString(String s) {
		
		s = s.toLowerCase();
		
		System.out.println("Convertido: " + s);
	
	}

}
