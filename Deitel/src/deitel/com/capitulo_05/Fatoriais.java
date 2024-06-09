package capitulo_05;

public class Fatoriais {

	public static void main(String[] args) {
		
		System.out.printf("%s%15s %n", "Valor", "Fatorial");
		for (int i = 1; i <= 20; i++) {
			long total = 1;
			System.out.printf("  %2d   ",i);
			for (int fatorial = 1; fatorial <= i; fatorial++) {
				total *= fatorial;
				
			}
			System.out.printf("   %-12d%n",total);
			
		}

	}

}
