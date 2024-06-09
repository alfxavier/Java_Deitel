package capitulo_07;

import java.security.SecureRandom;
import capitulo_07.instruções;
public class JogoDados {

	public static void main(String[] args) {
		int[] array = new int[13];
		
		for(int i = 0; i < 36000000; i++ ) {
			int soma = lacaDados()+lacaDados();
			array[soma]++; 
			
		}
		instruções.imprimeArrayInt(array);
		
		
		
	}
	
	public static int lacaDados(){
		SecureRandom randomNumbers = new SecureRandom();
		int i = randomNumbers.nextInt(6)+1;
		return i;
	}

}
