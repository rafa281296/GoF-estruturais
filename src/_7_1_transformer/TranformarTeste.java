package _7_1_transformer;

import javax.swing.JOptionPane;

public class TranformarTeste {

	public static void main(String[] args) {
		
		TransformaStringTemplate tst;
		
		String s = JOptionPane.showInputDialog("Digite algo, porfavor");
		
		System.out.println("Maiuscula");
		tst = new TransformarMaiuscula();
		tst.tranformar(s);
		
		System.out.println("\nMinuscula");
		tst = new TransformarMinuscula();
		tst.tranformar(s);
		
		System.out.println("\nDuplicar");
		tst = new TransformarDuplicar();
		tst.tranformar(s);
		
		System.out.println("\nInverter");
		tst = new TransformarInvertido();
		tst.tranformar(s);

	}

}
