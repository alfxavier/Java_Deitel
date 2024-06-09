package capitulo_05;

import java.util.Scanner;

public class BarraImpressao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.print("Digite um numero entre 1 e 30: ");
		int numero1 = input.nextInt();
		while (numero1 < 1 || numero1 > 30) {
			System.out.printf("%nNúmero invalido, digite um numero entre 1 e 30: ");
			numero1 = input.nextInt();
		}
		
		System.out.print("Digite um numero entre 1 e 30: ");
		int numero2 = input.nextInt();
		while (numero2 < 1 || numero2 > 30) {
			System.out.printf("%nNúmero invalido, digite um numero entre 1 e 30: ");
			numero2 = input.nextInt();
		}
		
		System.out.print("Digite um numero entre 1 e 30: ");
		int numero3 = input.nextInt();
		while (numero3 < 1 || numero3 > 30) {
			System.out.printf("%nNúmero invalido, digite um numero entre 1 e 30: ");
			numero3 = input.nextInt();
		}
		
		System.out.print("Digite um numero entre 1 e 30: ");
		int numero4 = input.nextInt();
		while (numero4 < 1 || numero4 > 30) {
			System.out.printf("%nNúmero invalido, digite um numero entre 1 e 30: ");
			numero4 = input.nextInt();
		}
		
		System.out.print("Digite um numero entre 1 e 30: ");
		int numero5 = input.nextInt();
		while (numero5 < 1 || numero5 > 30) {
			System.out.printf("%nNúmero invalido, digite um numero entre 1 e 30: ");
			numero5 = input.nextInt();
		}
		
		System.out.printf("%nnº: %d ",numero1);
		for (int i = 1; i <= numero1; i++) {
			System.out.print("*");
		}
		
		System.out.printf("%nnº: %d ",numero2);
		for (int i = 1; i <= numero2; i++) {
			System.out.print("*");
		}
		
		System.out.printf("%nnº: %d ",numero3);
		for (int i = 1; i <= numero3; i++) {
			System.out.print("*");
		}
		
		System.out.printf("%nnº: %d ",numero4);
		for (int i = 1; i <= numero4; i++) {
			System.out.print("*");
		}
		
		System.out.printf("%nnº: %d ",numero5);
		for (int i = 1; i <= numero5; i++) {
			System.out.print("*");
		}
	}
	
	

}
