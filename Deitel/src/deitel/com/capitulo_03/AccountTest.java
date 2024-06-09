package capitulo_03;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		
		//cria as contas e adiciona os saldos iniciais
		
		Account account1 = new Account("André", 50.00);
		Account account2 = new Account("João", -7.53);
		Account account3 = new Account("Joaquim", 150);
		
		//imprime o saldo inicial e o saldo da conta 
		
		displayAccount(account1);
		displayAccount(account2);
		displayAccount(account3);
		
	
	}
	
	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%s balance is: %.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}

}
