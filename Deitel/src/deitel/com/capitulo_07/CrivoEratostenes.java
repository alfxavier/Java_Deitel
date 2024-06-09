package capitulo_07;

import java.util.Arrays;

public class CrivoEratostenes {

	public static void main(String[] args) {
		boolean[] isPrimo = new boolean[100];
		Arrays.fill(isPrimo, true);

		for (int i = 2; i < isPrimo.length; i++) {
			if (isPrimo[i] == true) {
				// System.out.printf("Valor de I %d %s%n", i, isPrimo[i]);
				for (int z = 3; z < isPrimo.length; z++) {
					if (z != i) {
						if (z % i == 0) {
							isPrimo[z] = false;
						}
						// System.out.printf("Valor de Z %d %s%n", z, isPrimo[z]);
					}
				}
			}

		}

		for (int i = 2; i < isPrimo.length; i++) {
			if (isPrimo[i] == true) {
				System.out.printf("%d => %s%n", i, isPrimo[i]);
			}
		}

	}

}
