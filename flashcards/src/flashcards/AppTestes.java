package flashcards;

import java.util.ArrayList;

public class AppTestes {

	public static void main(String[] args) {
		
		ArrayList<Cartao> c = new ArrayList<Cartao>();
		
		c.add(new Cartao("O que é um objeto em Java?", "Um objeto é uma instância de uma classe em Java. Ele contém dados na forma de variáveis de instância e comportamentos na forma de métodos.", "Programação Orientada a Objetos", "Conceitos Básicos de Orientação a Objetos", "FC001"));
	
		
		
		System.out.println(c.get(0).getDataCriacao());
	}

}
