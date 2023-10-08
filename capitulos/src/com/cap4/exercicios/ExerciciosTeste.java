package com.cap4.exercicios;

import java.util.Scanner;


public class ExerciciosTeste {

	public static void main(String[] args) {
		int kmTotal = 0;
		int consumoToral = 0;
		Ex_4_17 consumo = new Ex_4_17();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vamos Iniciar!! Para encerrar digite 1999 para quilometragem rodada!");
		System.out.println("-----------------------------------------------------");
		System.out.print("Primeiro trecho. Favor entrar com quilometragem rodade: ");
		consumo.setKmDirigido(input.nextInt());
		System.out.print("Qual foi a quantidade de litros consumidos? ");
		consumo.setLitroConsumido(input.nextInt());
		
		
		
		while (consumo.getKmDirigido() != 1999) {
			System.out.println("O consumo para o trecho é de "+ consumo.km_l() + " km/l.");
			kmTotal += consumo.getKmDirigido();
			System.out.println("O total rodade foi "+ kmTotal);
			consumoToral += consumo.getLitroConsumido();
			System.out.println("Foram consunidos " + consumoToral + " litros.");
			System.out.println("----------------------");
			System.out.print("Infome a nova quilometragem rodada:");
			consumo.setKmDirigido(input.nextInt());
			System.out.print("Informe novo consumo: ");
			consumo.setLitroConsumido(input.nextInt());
			
			
		}
		System.out.println("-------------------");
		System.out.println("--------Fim da viagem!--------");
	}

}
