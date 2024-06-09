package capitulo_04;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contador = 1;
		int numero = 0;
		int maiorNumero = 0;
		int segundoNumeroMaior = 0;
		
		System.out.printf("%n%d/10",contador);
		System.out.printf("%nDigite um numero: ");
		maiorNumero = input.nextInt();
		contador++;
		
		System.out.printf("%n%d/10",contador);
		System.out.printf("%nDigite um numero: ");
		numero = input.nextInt();
		if (numero < maiorNumero){
			segundoNumeroMaior = numero;
		}else if (numero > maiorNumero) {
			segundoNumeroMaior = maiorNumero;
			maiorNumero = numero;
		} else if (numero == maiorNumero) {
			segundoNumeroMaior = numero;
		}
		contador++;
		
		while(contador <= 10) {
			System.out.printf("%n%d/10",contador);
			System.out.printf("%nDigite um numero: ");
			numero = input.nextInt();
			if (numero < maiorNumero){
				if (numero > segundoNumeroMaior) {
					segundoNumeroMaior = numero;
				} else if (numero == segundoNumeroMaior) {
					segundoNumeroMaior = numero;
				}
			}else if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			
			contador++;
		}
		
		System.out.printf("%n%nO maior número é: %d",maiorNumero);
		System.out.printf("%n%nO segundo número maio é: %d",segundoNumeroMaior);
	}

}
