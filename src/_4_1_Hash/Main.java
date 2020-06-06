package _4_1_Hash;

import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Integer[][] matrizHashMap = new Integer[][] {{25,17,98,35,15,30,87,3,9,10},{65,16,32,15,1,3,58,43,92,76}};
		Integer[][] matrizTreeMap = new Integer[][] {{6,83,16,45,10,65,97,31,47,85},{3,48,7,62,34,87,13,54,23,87}};

		Map<Integer, Integer> testeHashMap = new AdapterHashMap<Integer>(matrizHashMap);
		
		System.out.println("HashMap\n");
		
		for (Integer key: testeHashMap.keySet()) {
			
			System.out.println(key + " = " + testeHashMap.get(key));
		}
		
		Map<Integer, Integer> testeTreeMap = new AdapterTreeMap<Integer>(matrizTreeMap);
		
		System.out.println("\n\nTreeMap\n");
		
		for (Integer key: testeTreeMap.keySet()) {
			
			System.out.println(key + " = " + testeTreeMap.get(key));
		}
		

	}

}
