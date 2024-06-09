package capitulo_04;

import java.util.Scanner;

public class SalarioEmpregado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contador = 1;
		double horasTrabalhadas = 0.0;
		double valorHoraTrabalhada = 0.0;
		double funcionario1 = 0.0;
		double funcionario2 = 0.0;
		double funcionario3 = 0.0;
		
		while (contador <= 3) {
			
			System.out.printf("%nDigite as horas trabalhadas do funcionário %d: ", contador);
			horasTrabalhadas = input.nextDouble();
			System.out.printf("%nDigite o valor da hora trabalhada do empregado %d: ", contador);
			valorHoraTrabalhada = input.nextDouble();
			
			if (contador == 1 ) {
				if (horasTrabalhadas > 40) {
					funcionario1 = ((horasTrabalhadas - 40) * valorHoraTrabalhada * 1.5) + (40 * valorHoraTrabalhada);
				} else {
					funcionario1 = horasTrabalhadas * valorHoraTrabalhada;
				}
			} else if (contador == 2) {
				if (horasTrabalhadas > 40) {
					funcionario2 = ((horasTrabalhadas - 40) * valorHoraTrabalhada * 1.5) + (40 * valorHoraTrabalhada);
				} else {
					funcionario2 = horasTrabalhadas * valorHoraTrabalhada;
				}
			} else if (contador == 3) {
				if (horasTrabalhadas > 40) {
					funcionario3 = ((horasTrabalhadas - 40) * valorHoraTrabalhada * 1.5) + (40 * valorHoraTrabalhada);
				} else {
					funcionario3 = horasTrabalhadas * valorHoraTrabalhada;
				}
			}
			contador++;
		
		}
		
		System.out.println("--------------------------------------");
		System.out.printf("%nO Funcionario nº 1 recebeu: R$ %.2f", funcionario1);
		System.out.printf("%nO Funcionario nº 2 recebeu: R$ %.2f", funcionario2);
		System.out.printf("%nO Funcionario nº 3 recebeu: R$ %.2f", funcionario3);
		
	}

}
