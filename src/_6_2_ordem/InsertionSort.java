package _6_2_ordem;

public class InsertionSort implements Ordenacao {

	@Override
	public int[] ordenar(int[] v) {
		
		int i, a, x;
		
		for (a = 1; a < v.length; ++a) {
			x = v[a];
			
			for (i = a - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			
			v[i + 1] = x;
		}
		
		return v;
	}

}
