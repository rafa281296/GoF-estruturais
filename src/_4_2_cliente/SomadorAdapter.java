package _4_2_cliente;

import java.util.ArrayList;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado{

	@Override
	public int somaVetor(int[] vetor) {
		
		ArrayList<Integer> lista = new ArrayList<>();
		for(int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		
		int resultado = somaLista(lista);
		return resultado;
	}

	@Override
	public int somaInteiros(int a, int b) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b); 
		int resultado = somaLista(lista);
		return resultado;
	}

}
