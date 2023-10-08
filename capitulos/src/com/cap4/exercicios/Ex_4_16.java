package com.cap4.exercicios;

public class Ex_4_16 {
	
	//1 + 4 + 6 + 16 + 25 + 36 + 49 + 64 + 91 + 100 = 392
	
	int x = 1;
	int total = 0;
	
	public void mystery() {	
		while (x <=10) {
			
			int y = x * x;
			System.out.println(y);
			total += y;
			++x;
		}
		System.out.println("total: " + total);
	}
	
	

}
