package com.opp.guanabara.aula5;

public class ContaBanco {
	public int numeroConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//construtor
	public ContaBanco() {
		this.saldo = 0.0;
		this.status = false;
	}
	
	//Getters and Setters
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo == "CC" || tipo == "CP" )
		this.tipo = tipo;
	
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	} 
	
	//Metodos
	public void abrirConta(String tipo, double saldo) {
		this.setTipo(tipo);
		if (getTipo() == "CC") {
			setSaldo(saldo + 50);
			setStatus(true);
		} else if (getTipo() == "CP"){
			setSaldo(saldo + 100);
			setStatus(true);
		} else {
			setStatus(false);
		}
	}
	
	public void fecharConta() {
		if (getSaldo() > 0.0) {
			System.out.println("Conta com dinheiro !");
		} else if(getSaldo() < 0.0) {
			System.out.println("Conta negativa");
		} else {
			setStatus(false);
		}
	}
	
	public void depositar(double valor) {
		if (isStatus() == true && valor > 0.0) {
			setSaldo(getSaldo() + valor);
		}
	}
	
	public void sacar(double valor) {
		if ((valor > 0.0) && (getSaldo() >= valor) && (isStatus() == true)) {
			setSaldo(getSaldo() - valor);
		}
	}
	
	public void pagarMensalidade() {
		if (isStatus() == true) {
			if (getTipo() == "CC") {
				setSaldo(getSaldo() - 12.0);
			}else if (getTipo() == "CP") {
				setSaldo(getSaldo() - 20.0);
				
			}
		}else {
			System.out.println("Conta fechada!");
		}
	}
		
	public void status() {
		System.out.println("Numero da conta: " + getNumeroConta());
		System.out.println("Tipo : " + getTipo());
		System.out.println("Dono: " + getDono());
		System.out.println("Saldo : " + getSaldo());
		System.out.println("A conta está aberta: " + isStatus());
		
	}
}
