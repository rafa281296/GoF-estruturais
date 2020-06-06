package _7_2_vetor;

import java.util.Arrays;

public class TesteVetorDouble {

	public static void main(String[] args) {
		VetorDouble[] db = new VetorDouble[16];
		
			for(int i = 0; i < 16; i++) {
			db[i] = new VetorDouble(Math.floor(16*Math.random())+Math.random());
			System.out.println(db[i].doubleValue());
		}
		
		Arrays.sort(db);
		
		System.out.println("\nOrdenado por casas decimais\n");
		System.out.println(Arrays.toString(db));
		
		
	}

}
