package capitulo_07;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaPassagens {

	public static void main(String[] args) {
		boolean[] acento = new boolean[10];
		Arrays.fill(acento, false);
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s", "Por favor, digite 1 para Primeira classe e","Digite 2 para Segunda Classe:" );
		int escolha = input.nextInt();
		
		while (escolha == 1 || escolha == 2) {
			
			if (escolha == 1) {
				int contadorAcento = 0;
				int contadorAcento2 = 0;
				for (int i = 0; i <= 4; i++) {
					
					if (acento[i] == false) {
						acento[i] = true;
						System.out.printf("Poltrona nº %d, da 1ª classe.%n%n", i+1);
						break;
					}else {
						contadorAcento++;
					}
				}
				if (contadorAcento == 5) {
					System.out.printf("%n1ª classe lotada, aceita ficar na classe economica? 1=sim, 2=não");
					int pergunta = input.nextInt();
					
					if (pergunta == 1) {
						for (int i = 5; i <= 9; i++) {
							if (acento[i] == false) {
								acento[i] = true;
								System.out.printf("Poltrona nº %d, da 2ª classe.%n%n", i+1);
								break;
							}else {
								contadorAcento2++;
							}
						}
						if (contadorAcento2 == 5) {
							System.out.println("Voo lotado, o próximo voo parte em 3 horas");
							
							
							
						}
					} else {
						System.out.println("O próximo voo parte em 3 horas");
					}
				}
			} else if (escolha == 2) {
				int contadorAcento = 0;
				int contadorAcento2 = 0;
				for (int i = 5; i <= 9; i++) {
					if (acento[i] == false) {
						acento[i] = true;
						System.out.printf("Poltrona nº %d, da 2ª classe.%n%n", i+1);
						break;
					}else {
						contadorAcento2++;
					}
				}
				if (contadorAcento2 == 5) {
					System.out.printf("%n2ª classe lotada, aceita ficar na 1ª classe? 1=sim, 2=não");
					int pergunta = input.nextInt();
					if (pergunta == 1) {
						for (int i = 0; i <= 4; i++) {
							if (acento[i] == false) {
								acento[i] = true;
								System.out.printf("Poltrona nº %d, da 1ª classe.%n%n", i+1);
								break;
							}else {
								contadorAcento++;
							}
						}
						if (contadorAcento == 5) {
							System.out.println("Voo lotado, o próximo voo parte em 3 horas");
						}
					}
				}	
			}
			
			System.out.printf("%s%n%s", "Por favor, digite 1 para Primeira classe e","Digite 2 para Segunda Classe:" );
			escolha = input.nextInt();
		}
		
		
		
		
		input.close();
	}

}
