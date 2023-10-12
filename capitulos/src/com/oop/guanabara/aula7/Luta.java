package com.oop.guanabara.aula7;

import java.util.Random;

public class Luta {
	
	//Atributos
	private Lutador desafiante;
	private Lutador desafiado;
	private int raunds;
	private boolean aprovada;
	
	//metodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)) {
			setAprovada(true);
			setDesafiado(l1);
			setDesafiante(l2);
			System.out.println("Luta marcada!");
		}	
		else {
			setAprovada(false);
			setDesafiado(null);
			setDesafiante(null);
			System.out.println("Luta não marcada!");
		}	
			
		
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("Desafiante");
			this.desafiante.apresentar();
			System.out.println("Desafiado");
			this.desafiado.apresentar();
			
			Random gerador = new Random();
			int x = gerador.nextInt(3);
			
			switch (x){
				case 0: //Empatar
					System.out.println("---------------------------------");
					System.out.println("#### Empatou! ####");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: //Desafiado vence
					System.out.println("---------------------------------");
					System.out.println(desafiado.getNome() + " venceu!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:	//Desafiante Vence
					System.out.println("---------------------------------");
					System.out.println(desafiante.getNome() + " venceu!");
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}	
			
			
		} else {
			System.out.println("Luta não pode Acontecer");
		}
	}
	
	//metodos especiais 
	
	

	public Lutador getDesafiante() {
		return desafiante;
	}

//	public Luta(Lutador desafinate, Lutador desafiado, int raunds, boolean aprovada) {
//		super();
//		this.desafiante = desafinate;
//		this.desafiado = desafiado;
//		this.raunds = raunds;
//		this.aprovada = aprovada;
//	}

	public void setDesafiante(Lutador desafinate) {
		this.desafiante = desafinate;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public int getRaunds() {
		return raunds;
	}

	public void setRaunds(int raunds) {
		this.raunds = raunds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
	
	
}
