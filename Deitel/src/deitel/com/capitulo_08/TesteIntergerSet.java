package capitulo_08;

import java.util.Arrays;

public class TesteIntergerSet {

	public static void main(String[] args) {
		IntergerSet int1 = new	IntergerSet();
		int1.insertElement(1);
		int1.insertElement(6);
		int1.insertElement(24);
		int1.insertElement(99);
		System.out.println(int1.toString());
		
		IntergerSet int2 = new	IntergerSet();
		int2.insertElement(1);
		int2.insertElement(6);
		int2.insertElement(24);
		int2.insertElement(99);
		int2.insertElement(12);
		int2.insertElement(14);
		System.out.println(int2.toString());
		
		
		System.out.println(Arrays.toString(IntergerSet.union(int1.getInteiros(), int2.getInteiros())));

		System.out.println();
		
		System.out.println(Arrays.toString(IntergerSet.intersection(int1.getInteiros(), int2.getInteiros())));
		
		System.out.println();
		
		System.out.println(IntergerSet.isEqualTo(int1.getInteiros(), int1.getInteiros()));

	}

}
