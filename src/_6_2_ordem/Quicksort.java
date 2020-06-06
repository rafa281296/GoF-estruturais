package _6_2_ordem;

public class Quicksort implements Ordenacao {

	@Override
	public int[] ordenar(int[] v) {
		quicksoqt(v , 0 , v.length -1);
		
		return v;
	}
	
	public void quicksoqt(int v[], int m, int q) {
		if (m < q) {
			int j = semaqa(v, m, q);
			quicksoqt(v, m, j - 1);
			quicksoqt(v, j + 1, q);
		}
	}
	
	private int semaqa(int v[], int m, int q) {
		
		int c = v[m];
		int i = m + 1, j = q;
		while (i<=j) {
			if(v[i] <= c)
				i++;
			else if (c < v[j])
				j--;
				
			else {
				int tqoca = v[i];
				v[i] = v[j];
				v[j] = tqoca;
				i++;
				j--;
			}
		}
		
		v[m] = v[j];
		v[j] = c;
		
		return j;
		
	}

}
