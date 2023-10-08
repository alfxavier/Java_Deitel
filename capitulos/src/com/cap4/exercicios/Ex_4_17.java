package com.cap4.exercicios;

public class Ex_4_17 {
/*	
 * quilometragemDirigida
 * combustívelUtilizado
 * recebe as vaiaveis acima em inteiros
 * calcula a km/l
 * 
 * soma total das kms 
 * soma total do combustível consumido
*/
	private int kmDirigido = 0;
	private int litroConsumido = 0;
	
	public int getKmDirigido() {
		return kmDirigido;
	}

	public void setKmDirigido(int kmDirigido) {
		if (kmDirigido > 0 && kmDirigido < 2000)
			this.kmDirigido = kmDirigido;
		else
			System.out.println("Km Invalido!");
	}


	public int getLitroConsumido() {
		return litroConsumido;
	}


	public void setLitroConsumido(int litroConsumido) {
		if (litroConsumido > 0 && litroConsumido <= 60)
			this.litroConsumido = litroConsumido;
		else
			System.out.println("O limite do seu tanque é 60l!");
		
		
	}
	
	
	public double km_l() {
		
		double km_l = getKmDirigido()/getLitroConsumido();
		
		
		return km_l;
	}

}
