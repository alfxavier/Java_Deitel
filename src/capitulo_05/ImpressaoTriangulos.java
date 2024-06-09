package capitulo_05;

public class ImpressaoTriangulos {

	public static void main(String[] args) {
		
		
		for (int l = 1; l <= 10; l++) {
			for (int i = 1; i <= l; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		///////////////
		for (int l = 1; l <= 10; l++) {
			for (int i = 10; i >= l; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//////
		for (int l = 1; l <= 10; l++) {
			
			for (int b = 2; b <= l; b++) {
				System.out.print(" ");
				}
				
			
			for (int i = 10; i >= l; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		////////////////////
		for (int l = 1; l <= 10; l++) {
			
			for (int b = 9; b >= l; b--) {
				System.out.print(" ");
				}
				
			
			for (int i = 1; i <= l; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
