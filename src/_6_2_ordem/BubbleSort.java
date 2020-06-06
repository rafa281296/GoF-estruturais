package _6_2_ordem;

public class BubbleSort implements Ordenacao {

	@Override
	public int[] ordenar(int[] v) {

		for (int i = v.length-1 ; i > 0; i--) {
			for(int x = 0; x <= i -1 ; x++) {
				if(v[x] > v[x+1]) {
					int aux = v[x+1];
					v[x+1] = v[x];
					v[x] = aux;
				}
			}
		}
		return v;
	}

}
