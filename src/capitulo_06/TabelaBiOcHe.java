package capitulo_06;

public class TabelaBiOcHe {

	public static void main(String[] args) {
		System.out.printf("%4s%15s%15s%15s%n", "base 10", "base 2", "base 8", "base 16");

		for (int i = 1; i <= 256; i++) {
			System.out.printf("%4d%15s", i, "");
			setBinario(i);
			System.out.printf("%12s", "");
			setOctal(i);
			System.out.printf("%15s", "");
			setHexadecimal(i);
			System.out.println();
		}

	}

	public static void setBinario(int decimal) {
		int binario = 0;
		int modulo = decimal;
		int base = 0;

		// verifica a base binaria
		for (int i = 1; i <= decimal; i *= 2) {
			base = i;
		}
		// calcula o numero binario e imprime
		for (int j = base; j > 0; j /= 2) {
			binario = modulo / j;
			modulo %= j;
			System.out.print(binario);
		}
	}

	public static void setOctal(int decimal) {
		int octal = 0;
		int modulo = decimal;
		int base = 0;

		// verifica a base binaria
		for (int i = 1; i <= decimal; i *= 8) {
			base = i;
		}
		// calcula o numero binario e imprime
		for (int j = base; j > 0; j /= 8) {
			octal = modulo / j;
			modulo %= j;
			System.out.print(octal);
		}

	}
	public static void setHexadecimal(int decimal) {
		int hexadecimal = 0;
		int modulo = decimal;
		int base = 0;

		// verifica a base binaria
		for (int i = 1; i <= decimal; i *= 16) {
			base = i;
		}
		// calcula o numero binario e imprime
		for (int j = base; j > 0; j /= 16) {
			hexadecimal = modulo / j;
			modulo %= j;
			
			switch (hexadecimal) {
			case 10:
				System.out.print("A");
				break;
			case 11:
				System.out.print("B");
				break;
			case 12:
				System.out.print("C");
				break;
			case 13:
				System.out.print("D");
				break;
			case 14:
				System.out.print("E");
				break;
			case 15:
				System.out.print("F");
				break;
			default:
				System.out.print(hexadecimal);
				break;
		
			}
			
			
		}

	}

}
