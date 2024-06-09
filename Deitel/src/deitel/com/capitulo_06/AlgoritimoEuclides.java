package capitulo_06;

public class AlgoritimoEuclides {

	public static void main(String[] args) {
		System.out.println(mdc(1256,1852));

	}
	public static int mdc(int a, int b) {
		int mdc = 0;
		
		
		while (a % b != 0) {
			mdc = a % b;
			a = b;
			b = mdc;
			System.out.println(mdc);
		}
		
		
		return mdc;
	}

}
