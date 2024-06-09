package capitulo_07;

import java.security.SecureRandom;

public class VendasTotais {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int[] produto = { 55, 11, 20, 28, 57 };
		int[][] notasFiscais = new int[600][3];
		// notasFiscais = null;
		int contador = 0;
		for (int d = 0; d < 30; d++) {
			for (int v = 0; v < 4; v++) {
				for (int n = 0; n < random.nextInt(5); n++) {
					int produtoRandom = random.nextInt(5);
					int qtdRandom = random.nextInt(1, 100);
					notasFiscais[contador][0] = v + 1;
					notasFiscais[contador][1] = produtoRandom + 1;
					notasFiscais[contador][2] = produto[produtoRandom] * qtdRandom;

					contador++;
				}

			}
		}
		vendasVendedor(notasFiscais);
		vendasProduto(notasFiscais);
		outputArray(notasFiscais);
	}

	public static void outputArray(int[][] array) {
		System.out.printf("%s%10s%5s%n","Vendedor", "Produto","R$");
		for (int row = 0; row < array.length; row++) {
			if (array[row][0] != 0) {
				for (int column = 0; column < array[row].length; column++) {

					System.out.printf("%8d", array[row][column]);

				}
				System.out.println();

			}
		}
	}

	public static void vendasVendedor(int[][] array) {
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		for (int row = 0; row < array.length; row++) {
			switch (array[row][0]) {
			case 1:
				total1 += array[row][2];
				break;
			case 2:
				total2 += array[row][2];
				break;
			case 3:
				total3 += array[row][2];
				break;
			case 4:
				total4 += array[row][2];
				break;
			default:
				break;
			}
		}

		System.out.printf("O Vendedor 1 vendeu: R$ %d%n%n", total1);
		System.out.printf("O Vendedor 2 vendeu: R$ %d%n%n", total2);
		System.out.printf("O Vendedor 3 vendeu: R$ %d%n%n", total3);
		System.out.printf("O Vendedor 4 vendeu: R$ %d%n%n", total4);

	}

	public static void vendasProduto(int[][] array) {
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		int total5 = 0;
		for (int row = 0; row < array.length; row++) {
			switch (array[row][1]) {
			case 1:
				total1 += array[row][2];
				break;
			case 2:
				total2 += array[row][2];
				break;
			case 3:
				total3 += array[row][2];
				break;
			case 4:
				total4 += array[row][2];
				break;
			case 5:
				total5 += array[row][2];
				break;
			default:
				break;
			}
		}

		System.out.printf("O Produto 1 vendeu: R$ %d%n%n", total1);
		System.out.printf("O Produto 2 vendeu: R$ %d%n%n", total2);
		System.out.printf("O Produto 3 vendeu: R$ %d%n%n", total3);
		System.out.printf("O Produto 4 vendeu: R$ %d%n%n", total4);
		System.out.printf("O Produto 5 vendeu: R$ %d%n%n", total5);

	}

}
