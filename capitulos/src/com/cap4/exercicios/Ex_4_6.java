package com.cap4.exercicios;

public class Ex_4_6 {
	int sum = 0;
	int x = 1;
	
	
	public void  soma() {
		
		while (x <= 10) {
		
			sum += x; // sum = sum + x -> soma sum + x e adiciona a sum
			System.out.println("Valor de sum: "+sum);
			++x; // x = x + 1 -> incrementa x + 1
			System.out.println("Valor de x: " + x);
		}
		System.out.println(sum);		
	}
	
	
}
