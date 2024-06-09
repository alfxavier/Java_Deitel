package capitulo_04;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aprovacoes = 0;
		int reprovacoes = 0;
		int contador = 1;
		
		while (contador <= 10) {
			System.out.print("Insira o resultado do exame: ");
			int resultado = input.nextInt();
			
			if (resultado == 1) {
				aprovacoes++;
				contador++;
			} else if (resultado == 2){
				reprovacoes++;
				contador++;
			} else {
				System.out.println("Valor Incorreto!");
			}
			
			System.out.println(contador);
		}
		
		System.out.printf("Total de aprovados: %d%n", aprovacoes);
		System.out.printf("Total de reprovados: %d%n", reprovacoes);

		if (aprovacoes > 8)
			System.out.println("Bonus to instrutor!");

	}

}
