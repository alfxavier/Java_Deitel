package capitulo_05;

public class teste {

	public static void main(String[] args) {
		double pi = 3.14159 * 100000;
		int i = (int)pi;
		int a, b, c, d, e, f;
		
		a = (i / 100000) % 10;
		b = (i / 10000) % 10;
		c = (i / 1000) % 10;
		d = (i / 100) % 10;
		e = (i / 10) % 10;
		f = (i % 10);
		
		System.out.printf("%d %d %d %d %d %d %d", i, a, b, c, d, e, f);

	}

}
