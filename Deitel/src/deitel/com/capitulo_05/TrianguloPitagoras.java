package capitulo_05;

public class TrianguloPitagoras {

	public static void main(String[] args) {
		int const1 = 500;
		System.out.printf("%s%15s%15s %n", "Lado1", "Lado2", "Hipotenusa");
		
		for (int i = 1; i <= const1; i++) {
			for (int j = 1; j <= const1; j++) {
				for (int k = 1; k <= const1; k++) {
					boolean isTrinaguloPitagoras = ((i*i)+(j*j) == (k*k));
					if (isTrinaguloPitagoras) {
						System.out.printf("%4s%15s%11s %n",i,j,k);
					}
					
				}
			}
		}

		

	}

}
