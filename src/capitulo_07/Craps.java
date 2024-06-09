package capitulo_07;


import java.security.SecureRandom;
import java.util.ArrayList;

public class Craps {
	public static final SecureRandom randomNumbers = new SecureRandom();

	private enum Status {
		CONTINUE, WON, LOST
	};

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		ArrayList<Integer> winsArray = new ArrayList<>();
		ArrayList<Integer> lossArray = new ArrayList<>();
		ArrayList<Integer> jogadasArray = new ArrayList<>();
		int somaLoss = 0;
		int somaWins = 0;
		int somaJogadas = 0;
		double chanceGanhar = 0.0;
		for (int i = 0; i < 1000000; i++) {
			int wins = 0;
			int loss = 0;
			int jogadas = 0;
			int myPoint = 0;
			
			Status gameStatus;

			int sumOfDice = rollDice();

			switch (sumOfDice) {

			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				wins++;
				jogadas++;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				loss++;
				jogadas++;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				//System.out.printf("Point in %d%n", myPoint);
				break;
			}

			while (gameStatus == Status.CONTINUE) {
				sumOfDice = rollDice();

				if (sumOfDice == myPoint) {
					gameStatus = Status.WON;
					wins++;
				}	
				else if (sumOfDice == SEVEN) {
					gameStatus = Status.LOST;
					loss++;
				}
				jogadas++;

			}
			
			winsArray.add(wins);
			lossArray.add(loss);
			jogadasArray.add(jogadas);

//			if (gameStatus == Status.WON) {
//				//System.out.println("Play Wins");
//				winsArray.add(wins); 
//			}
//			else {
//				//System.out.println("Play Loses");
//				lossArray.add(loss);
//			}	

		}
		System.out.printf("%4s%10s%10s%10s%n", "Posição", "Ganhos", "Perdas", "jogadas");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%4d%10d%10d%10d%n", i + 1, winsArray.get(i), lossArray.get(i), jogadasArray.get(i));
		}
		// soma dos ganhos
		for (int numero : winsArray) {
			somaWins += numero;
		}
		// soma das perdas
		for (int numero : lossArray) {
			somaLoss += numero;
		}
		// soma jogadas
		for (int numero : jogadasArray) {
			somaJogadas += numero;
		}
		System.out.printf("%d %d %d%n", somaWins, somaLoss, somaJogadas);
		
		chanceGanhar = (double)somaWins / 1000000;
		System.out.printf("As chande de ganhar são %.2f%s%n", chanceGanhar*100,"%");
		
		System.out.printf("A duração média do jogo é de %f%n", (double)somaJogadas/1000000);
		
		somaWins = 0;
		somaLoss = 0;
		for(int i = 0; i < 1000000; i++) {
			if (jogadasArray.get(i) > 2) {
				if (winsArray.get(i) == 1)
					somaWins++;
				else 
					somaLoss++;
			}
		}
		
		System.out.printf("Ganhos/Perdas quando jogasdas maior que 2: %d  %d ", somaWins, somaLoss);
		
		
	}

	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);

		int sum = die1 + die2;

		//System.out.printf("Play rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

}
