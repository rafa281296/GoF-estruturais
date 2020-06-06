package _7_1_transformer;

public class TransformarInvertido extends TransformaStringTemplate {
	
	@Override
	public void alterarString(String s) {
		
		s = new StringBuilder(s).reverse().toString();
		
		
		
		System.out.println("Convertido: " + s);
	
	}

}
