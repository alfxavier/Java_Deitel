package capitulo_05;

public class JurosCompostos {

	public static void main(String[] args) {
		double total;
		double principal = 1000.0;
		
		for (int j = 5; j <= 10; j++) {
			double juros = (double) j/100;
			//System.out.println(5/100);
			System.out.printf("%s%20s %n", "Anos", "Total com juros");
			for (int y = 1; y <= 10; y++) {
				total = principal * Math.pow(1.0 + juros, y);
				System.out.printf("%4d%,20.2f%n", y, total);
				
			}
		}

	}

}
