package com.oop.guanabara.aula6;

public class ControleRemoto implements Controlador{
	
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Métodos Especiais
	public ControleRemoto() {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	//GET E SET
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	//Métodos Abstratos
	@Override //sobreescrevendo
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("------MENU-----");
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.print("Volume: " + this.getVolume() +" => ");
		for (int i = 1; i <= this.getVolume(); i+=1) {
			System.out.print("|");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolunme() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
		
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0)
			this.setVolume(5);
		
	}

	@Override
	public void play() {
		if (this.isLigado() && this.isTocando() == false)
			this.setTocando(true);
		
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando() == true)
			this.setTocando(false);
		
	}
	
	
	
	
	
	
}
