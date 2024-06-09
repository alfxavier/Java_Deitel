package capitulo_04;

import java.util.Scanner;

public class DecimalBinario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Informe um número Binário: ");
		int binario = input.nextInt();

		
		int valorPosicional = 1;
		int divisorResto = 10;
		int divisorDivisao = 1;
		int total = 0;
				
		while (divisorDivisao <= binario) {
			
			total += (((binario / divisorDivisao) % divisorResto) * valorPosicional);
			
			divisorDivisao *= divisorResto;
			
			valorPosicional *= 2;
			
		}
		System.out.printf("O numero binario %d corresponde a %d em decimais.",binario, total);
		
		
		
	
	}

}
