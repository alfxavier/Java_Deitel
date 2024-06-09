package capitulo_08;

import java.util.Arrays;

public class IntergerSet {

	private boolean[] inteiros;

	public IntergerSet() {
		inteiros = new boolean[100];
	}

	

	public static boolean[] union(boolean[] int1, boolean[] int2) {
		if (int1.length > 100 || int2.length > 100) {
			throw new IllegalArgumentException("Tamanho do Array excedeu 100!");
		}
		boolean[] union = new boolean[100];
		for(int i = 0; i < union.length; i++) {
			if (int1[i] == true || int2[i] == true) {
				union[i] = true;
			}else {
				union[i] = false;
			}
		}
		return union;
	}

	public static boolean[] intersection(boolean[] int1, boolean[] int2) {
		if (int1.length > 100 || int2.length > 100) {
			throw new IllegalArgumentException("Tamanho do Array excedeu 100!");
		}
		boolean[] intersection = new boolean[100];
		for(int i = 0; i < intersection.length; i++) {
			if (int1[i] == false || int2[i] == false) {
				intersection[i] = false;
			}else {
				intersection[i] = true;
			}
		}
		
		
		return intersection;
	}
	
	public  void insertElement(int numero) {
		inteiros[numero] = true;
		
	}
	
	public void deleteElement(int numero) {
		inteiros[numero] = false;
	}
	
	public static boolean isEqualTo(boolean[] int1, boolean[] int2) {
		if (int1.length > 100 || int2.length > 100) {
			throw new IllegalArgumentException("Tamanho do Array excedeu 100!");
		}
		for(int i = 0; i < int1.length; i++) {
			if (int1[i] != int2[i]) {
				return false;
			}
		}
		return true;
		
	}

	@Override
	public String toString() {
		String[] format = new String[inteiros.length];
		for (int i = 0; i < inteiros.length; i++) {
			format[i] = inteiros[i] == true?(i+" "):"---";
		}
		return Arrays.toString(format);	
	}



	public boolean[] getInteiros() {
		return inteiros;
	}



}
