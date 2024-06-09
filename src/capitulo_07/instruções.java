package capitulo_07;

import java.security.SecureRandom;

public class instruções {

	public static void main(String[] args) {
		double[] a = criaArrayDouble(100);

		imprimeArrayDouble(a);
		ordemCrescente(a);
		// imprimeArrayDouble(a);
		imprimeArrayDouble(a);

	}

	// a) Exiba o valor do elemento 6 do array f.
	public static int element6(int[] f) {
		int g = f[5];

		return g;
	}

	// b) Inicialize cada um dos cinco elementos de array de inteiros unidimensional
	// g como 8.

	public static int[] inicialize(int i) {
		int[] r = new int[5];
		for (int z = 0; z < r.length; z++) {
			r[z] = i;
		}
		return r;
	}

	// c) Some os 100 elementos do array de ponto flutuante c.
	public static double[] criaArrayDouble(int i) {
		SecureRandom randomNumbers = new SecureRandom();
		double[] c = new double[i];
		for (int z = 0; z < c.length; z++) {
			c[z] = randomNumbers.nextDouble(100.99);
		}
		return c;
	}

	public static int[] criaArrayInt(int i) {
		SecureRandom randomNumbers = new SecureRandom();
		int[] c = new int[i];
		for (int z = 0; z < c.length; z++) {
			c[z] = randomNumbers.nextInt(10 * i);
		}
		return c;
	}

	public static double somaArray(double[] i) {
		double total = 0;
		for (int z = 0; z < i.length; z++) {
			total += i[z];
		}
		return total;
	}
	// d) Copie o array a de 11 elementos para a primeira parte de array b, que
	// contém 34 elementos.

	public static void imprimeArrayInt(int[] i) {
		System.out.printf("%4s%10s%n", "Índice", "Valor");
		for (int z = 0; z < i.length; z++) {
			System.out.printf("%4d%10d%n", z + 1, i[z]);
		}
		System.out.println();
	}

	public static void imprimeArrayDouble(double[] i) {
		System.out.printf("%4s%10s%n", "Índice", "Valor");
		for (int z = 0; z < i.length; z++) {
			System.out.printf("%4d%10.2f%n", z + 1, i[z]);
		}
		System.out.println();
	}
	// e) Determine e exiba os maiores e menores valores contidos no array de ponto
	// flutuante w de 99 elementos.

	public static double maiorElemento(double[] i) {
		double maior = i[0];
		for (int z = 0; z < i.length; z++) {
			if (i[z] > maior) {
				maior = i[z];
			}
		}
		return maior;
	}

	public static double menorElemento(double[] i) {
		double menor = i[0];
		for (int z = 0; z < i.length; z++) {
			if (i[z] < menor) {
				menor = i[z];
			}
		}
		return menor;
	}

	public static double[] ordemCrescente(double[] i) {
		// double menor = i[0]
		for (int y = 0; y < i.length; y++) {

			for (int z = 0; z < i.length; z++) {
				if (i[z] != i[i.length - 1]) {
					if (i[z] > i[z + 1]) {
						double menor = i[z + 1];
						i[z + 1] = i[z];
						i[z] = menor;

					}

				}

			}
		}

		return i;
	}

}
