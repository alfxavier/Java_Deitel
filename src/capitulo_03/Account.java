package capitulo_03;

public class Account {
	private String name;
	private double balance;
	
	//construtor
	public Account(String name, double balance) { //o nome do construtor é o nome da classe!
		this.name = name;
		
		if (balance > 0.0)
			this.balance = balance;
	}
	// metodo deposita
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public double getBalance(){
		return balance;
	}
	//metodo Withdrawal (retirada)
	public String withdrawal(double withdrawalAmount) {
		if (withdrawalAmount > balance || withdrawalAmount < 0.0) {
			return "Withdrawal amount exceeded account balance";
		}else {
			balance = balance - withdrawalAmount;
			return "Withdrawal accepted!";}
	}
	//metodo get e set nome da conta
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
