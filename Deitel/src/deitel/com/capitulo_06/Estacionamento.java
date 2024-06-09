package capitulo_06;

import java.util.Scanner;

public class Estacionamento {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double lucroDia = 0;
		
		System.out.print("Informe a quantidade de horas de uso: ");
		double horasEstacionadas = input.nextDouble();
		
		while (horasEstacionadas != 0.0) {
			lucroDia += valorEstacionamento(horasEstacionadas);
			
			System.out.printf("%nCaixa: $%.2f", lucroDia);
			
			System.out.printf("%nInforme a quantidade de horas de uso: ");
			horasEstacionadas = input.nextDouble();
		
		}
		
		System.out.printf("%n%n%nCaixa total do dia foi de: $%.2f", lucroDia);
		
	}

	public static double valorEstacionamento(double hora) {
		double total = 0.0;
		if (hora > 3.0) {
			total = 2.0 + (0.5 * (hora - 3));
			total = total > 10.0 ? 10 : total;
		} else {
			total = 2.0;
		}

		return total;
	}

}
