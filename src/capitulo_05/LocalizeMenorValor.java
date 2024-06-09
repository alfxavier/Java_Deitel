package capitulo_05;

import java.util.Scanner;

public class LocalizeMenorValor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("informe quantos valores deseja fornecer: ");
		int valoresQtd = input.nextInt();
		System.out.printf("%nInforme um numero inteiro: ");
		int valorInteiro = input.nextInt();
		int menor = valorInteiro;
		
		for (int i = 1; i < valoresQtd; i++) {
			
			System.out.printf("%nInforme um numero inteiro: ");
			valorInteiro = input.nextInt();
			if (valorInteiro < menor) {
				menor = valorInteiro;
			}
			
		}
		
		System.out.println("O valor menor é: " + menor);

	}

}
