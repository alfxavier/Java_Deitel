package capitulo_04;

public class Cliente {
	private int numeroConta;
	private int saldo;
	private int totalDespesas;
	private int totalCreditos;
	private int limiteCredito;
	
	public Cliente(int numeroConta, int saldo, int totalDespesas, int totalCreditos, int limiteCredito) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.totalDespesas = totalDespesas;
		this.totalCreditos = totalCreditos;
		this.limiteCredito = limiteCredito;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		if (saldo > 0)
			this.saldo = saldo;
	}

	public int getTotalDespesas() {
		return totalDespesas;
	}

	public void setTotalDespesas(int totalDespesas) {
		if (totalDespesas > 0)
			this.totalDespesas = totalDespesas;
	}

	public int getTotalCreditos() {
		return totalCreditos;
	}

	public void setTotalCreditos(int totalCreditos) {
		if( totalCreditos > 0)
			this.totalCreditos = totalCreditos;
	}

	public int getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(int limiteCredito) {
		if (limiteCredito >= 0)
			this.limiteCredito = limiteCredito;
	}
	
	public String setNovoSaldo() {
		String status = "";
		setSaldo(getSaldo()+ getTotalDespesas() - getTotalCreditos());
			if (getSaldo() > getLimiteCredito())
				status = "Limite de Crédito excedido!";
			else
				status = "Saldo Atulizado!";
				
		return status;
	}
	
}
