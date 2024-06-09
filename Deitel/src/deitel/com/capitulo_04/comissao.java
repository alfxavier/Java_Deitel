package capitulo_04;

import java.util.Scanner;

public class comissao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double item1 = 239.99;
		double item2 = 129.75;
		double item3 = 99.95;
		double item4 = 350.89;
		double fixo = 200.00;
		double margem = 0.09;
		double subtotal = 0.0;
		double total = 0.0;
		
		
		System.out.print("Insira o numero do item ou -1 para sair: ");
		int item = input.nextInt();
		System.out.printf("%nInsira a quantidade de itens vendidos ou -1 para sair: ");
		int quantidade = input.nextInt();
		
		while (item != -1 || quantidade != -1) {
			if (item == 1) 
				subtotal = quantidade * item1 * margem;
			if (item == 2) 
				subtotal = quantidade * item2 * margem;
			if (item == 3) 
				subtotal = quantidade * item3 * margem;
			if (item == 4) 
				subtotal = quantidade * item4 * margem;
			total += subtotal;
			System.out.println(subtotal);
			System.out.printf("%nInsira o numero do item ou -1 para sair: ");
			item = input.nextInt();
			System.out.printf("%nInsira a quantidade de itens vendidos ou -1 para sair: ");
			quantidade = input.nextInt();
		}
		System.out.println(total);
		total += fixo;
		System.out.printf("%nTotal de comissão recebida foi de R$ %.2f",total);
	}

}
