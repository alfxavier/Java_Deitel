package capitulo_06;

public class NumeroPrimo {

	public static void main(String[] args) {
		for(int i = 1; i < 10000; i++) {
			if (i % 2 != 0) {
				if (i % 3 != 0) {
					if (i % 5 != 0) {
						if ( i % 7 != 0) {
							System.out.println(i);
						}
					}
				}
			}
			
		}

	}

}
