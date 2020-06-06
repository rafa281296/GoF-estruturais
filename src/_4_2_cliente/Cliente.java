package _4_2_cliente;

public class Cliente {
	private SomadorEsperado sum;

	public Cliente(SomadorEsperado somador) { 
		this.sum =somador;
	}

	public void executar() {
		int[] vetor = new int[] {56,13,21,89,47,65,32,65,87,6}; 
		int soma =sum.somaVetor(vetor); 
		System.out.println("Resultado: " +soma); 
	}
}
