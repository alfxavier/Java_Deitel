package capitulo_05;

public class ProdutoInteiroImpar {

	public static void main(String[] args) {
		int produto = 1;
		for (int i = 1; i <= 15; i++) {
			if (i % 2 != 0) {
				produto *= i;
				System.out.printf("Iteração: %d, Produto: %d.%n",i,produto);
			}
		}
		System.out.println(produto);
	}

}
