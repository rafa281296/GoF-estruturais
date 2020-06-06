package _6_2_ordem;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		 int quantidade = 10000;
         int[] vetor = new int[quantidade];

         for (int h = 0; h < vetor.length; h++) {
                 vetor[h] = (int) (Math.random()*quantidade);
                 
         }
	
         int i = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Ordenação: \n 1 para InsertionSort \n 2 para  QuickSort \n 3 para SelectionSort\n 4 para BubbleSort"));
         
		Ordenacao ord = escolhaOrdenacao(i);
		
		long tempoInicial = System.currentTimeMillis();
		
		vetor = ord.ordenar(vetor); 
		
		long tempoFinal = System.currentTimeMillis();
		
		for(int n = 0 ; n < vetor.length ; n++) {
			
			System.out.println(vetor[n]);
		}
		
		 System.out.println("Tempo total: " + (tempoFinal - tempoInicial) + " ms");

	}
	
	
	public static Ordenacao escolhaOrdenacao(int i) {
		Ordenacao ord;
		switch(i) {
		case 1:
			ord = new InsertionSort();
			break;
		case 2:
			ord = new Quicksort();
			break;
		case 3:
			ord = new SelectionSort();
			break;
		case 4:
			ord = new BubbleSort();
			break;
		default:
			ord = null;
		}
		
		return ord;
		
	}

}
