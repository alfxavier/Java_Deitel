package capitulo_04;

public class TesteCriptografia {

	public static void main(String[] args) {
		Criptografia cript = new Criptografia();
		
		System.out.println(cript.setCriptografia(1234));
		System.out.println();
		System.out.println(cript.descriptografar(189));
		
		
		
	}

}
