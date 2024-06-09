package capitulo_04;

public class TabuleiroXadrez {

	public static void main(String[] args) {
		int count = 4;
		
		while (count > 0) {
			int contadorLinha1 = 8;
			int contadorLinha2 = 8;
			while (contadorLinha1 > 0) {
				System.out.print("* ");
				contadorLinha1--;
			}
			System.out.println();
			System.out.print(" ");
			while (contadorLinha2 > 0) {
				System.out.print("* ");
				contadorLinha2--;
			}
			System.out.println();
			
			count--;
		}

	}

}
