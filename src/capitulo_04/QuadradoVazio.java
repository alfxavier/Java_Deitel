package capitulo_04;

import java.util.Scanner;

public class QuadradoVazio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
						
		System.out.print("Informe o lado do quadrado de 1 a 20: ");
		int lado = input.nextInt();
		int altura = lado - 2;
		int lado1 = lado;
		int lado2 = lado;
		
		if (lado > 1 && lado <= 20) {
			while (lado1 > 0) {
				
				System.out.print("* ");
				
				lado1--;
			}
			
			System.out.println();
			
			while (altura > 0) {
				int centro = lado - 2;
				System.out.print("* ");
				while (centro > 0) {
					System.out.print("  ");
					centro--;
				}
				System.out.println("*");
				altura--;
			}
			
					
			while (lado2 > 0) {
				
				System.out.print("* ");
				
				lado2--;
			}
		} else {
			System.out.println("Tamanho do quadrado invalido.");
		}
	}

}
