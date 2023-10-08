package com.cap4.exercicios;

public class Ex_4_7 {
	int product = 5;
	int x = 5;
	
	public void produto() {
		
		product *= x++; 
		
		System.out.println(product + " " + x);
	}
	
}
