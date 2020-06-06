package _4_2_cliente;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();

	}

}
