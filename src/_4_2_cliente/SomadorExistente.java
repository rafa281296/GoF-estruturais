package _4_2_cliente;

import java.util.List;

public class SomadorExistente {

	public int somaLista(List<Integer> list) {
		int result = 0;
		for (int i : list)
			result += i;
		return result;
	}
}
