package capitulo_05;

public class Sum {

	public static void main(String[] args) {

		int total = 0;
		
		for (int number = 2; number <= 20; number += 2) {
			System.out.println(number);
			total += number;
			System.out.println(total);
			}
		
		System.out.printf("sum is %d%n", total);
		
	}

}
