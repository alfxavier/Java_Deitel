package capitulo_05;

import java.util.Scanner;

public class CalculoVendas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double produto1 = 2.98;
		double produto2 = 4.50;
		double produto3 = 9.98;
		double produto4 = 4.49;
		double produto5 = 6.87;
		double totalVendido = 0.0;
		
		System.out.printf("%nInsira o número do Produto: ");
		int numeroProduto = input.nextInt();
		System.out.printf("%nInsira a quantidade vendida: ");
		int qtdProduto = input.nextInt();
		
		while (numeroProduto != -1 || qtdProduto != -1 ) {
				
			double subtotal = 0.0;
			
			switch(numeroProduto) {
			case 1:
				subtotal = produto1 * qtdProduto;
				break;
			case 2: 
				subtotal = produto2 * qtdProduto;
				break;
			case 3: 
				subtotal = produto3 * qtdProduto;
				break;
			case 4: 
				subtotal = produto4 * qtdProduto;
				break;
			case 5: 
				subtotal = produto5 * qtdProduto;
				break;
			default:
				break;
			
			}
			//System.out.println(subtotal);
			totalVendido += subtotal;
			//System.out.println(totalVendido);
			
			System.out.printf("%nInsira o número do Produto: ");
			numeroProduto = input.nextInt();
			System.out.printf("%nInsira a quantidade vendida: ");
			qtdProduto = input.nextInt();
		}

		System.out.printf("%nTotal vendido: R$ %.2f", totalVendido);
	}

}
