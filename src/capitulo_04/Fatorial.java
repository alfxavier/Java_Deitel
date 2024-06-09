package capitulo_04;

public class Fatorial {

	public static void main(String[] args) {
		int n = 5;
		int total = 1;
		while (n > 0) {
		    
			total *= n;
			 
			n--;
		}
		System.out.println(total);
		

	}

}
