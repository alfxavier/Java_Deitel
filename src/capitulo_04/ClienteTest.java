package capitulo_04;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente conta1 = new Cliente(1, 1000, 500, 50, 2000);
		
		System.out.println(conta1.setNovoSaldo());
		
		System.out.println(conta1.getSaldo());
		
		conta1.setTotalDespesas(1000);
		conta1.setLimiteCredito(500);
		System.out.println(conta1.getTotalDespesas());
		System.out.println(conta1.setNovoSaldo());
		System.out.println(conta1.getSaldo());


	}

}
