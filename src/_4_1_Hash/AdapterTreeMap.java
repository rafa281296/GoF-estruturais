package _4_1_Hash;

import java.util.Map;
import java.util.TreeMap;

public class AdapterTreeMap<K> extends TreeMap<K, K> implements Map<K, K> {

	private static final long serialVersionUID = 1L;
	
	public AdapterTreeMap(K[][] matriz) {
		
		for (int x = 0 ; x < matriz[0].length; x++ ) {
			
			put(matriz[0][x], matriz[1][x]);
		}
	}

}
