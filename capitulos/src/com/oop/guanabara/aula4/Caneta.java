package com.oop.guanabara.aula4;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String modelo, String cor, float ponta) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
		this.tampar();
			
		
		
	}
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo: "+ getModelo());
		System.out.println("Ponta: "+ getPonta());
		System.out.println("Cor da Caneta é: "+ this.cor);
		System.out.println("A Caneta está tampada? "+ this.tampada);
	}
}
