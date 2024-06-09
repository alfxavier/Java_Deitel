package capitulo_05;

public class CauculaPi {

	public static void main(String[] args) {
		double cont1 = 4.0;
		int termos = 200000;
		double pi = 0;
		int divisor = 1; 
		System.out.println("*****************************************************************************");
		System.out.printf("%s%15s %n", "Posição", "PI");
		
		for (int i = 1; i <= termos; i++) {
			//double somador = cont1/divisor;
			//System.out.println(somador);
			pi += (cont1/divisor);
			if (pi > 0) {
				cont1 *= -1;
			} else {
				cont1 *= -1;
			}
			
			System.out.printf("%4d%,40.20f%n", i, pi);
			
			double p = pi * 100000;
			int m = (int)p;
			int a, b, c, d, e, f;
			
			a = (m / 100000) % 10;
			b = (m / 10000) % 10;
			c = (m / 1000) % 10;
			d = (m / 100) % 10;
			e = (m / 10) % 10;
			f = (m % 10);
			
			if (a == 3 && b == 1 && c == 4 && d == 1 && e == 5 && f == 9) {
				System.out.printf("%nO primeiro termo com PI = 3.14159 é: %d",i);
				break;
			}
			
			divisor += 2;
			//System.out.println(divisor);
	
		}
	}
}
