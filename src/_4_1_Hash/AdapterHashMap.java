package _4_1_Hash;

import java.util.HashMap;
import java.util.Map;

public class AdapterHashMap<K> extends HashMap<K, K> implements Map<K, K> {
	
	private static final long serialVersionUID = 1L;
	
	public AdapterHashMap(K[][] matriz){
		
		for( int x = 0; x < matriz[0].length; x++) {
			
			put(matriz[0][x], matriz[1][x]);
		}
		
	} 

}
