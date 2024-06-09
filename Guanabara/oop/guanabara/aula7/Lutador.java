package com.oop.guanabara.aula7;

public class Lutador {
	
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
		
	//Métodos Públicos
	public void apresentar() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
		System.out.println("Diretamente de " + getNacionalidade());
		System.out.println("com " + getIdade() + " anos e " + getAltura() + "m");
		System.out.println("pesando " + getPeso() + "kg");
		System.out.println(getVitorias() + " vitórias");
		System.out.println(getDerrotas() + " derrotas e");
		System.out.println(getEmpates() + " empates!");
	}
	public void status() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(getNome() + " é um peso " + getCategoria());
		System.out.println("Ganhou " + getVitorias() + " vezes");
		System.out.println("Perdeu " + getDerrotas() + " vezes");
		System.out.println("Empatpu "+ getEmpates() + " vezes");
	}
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
	//Métodos Especiais
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	//GET SET
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
			this.setCategoria();
		}
		public String getCategoria() {
			return categoria;
		}
		private void setCategoria() {
			if (getPeso() < 52.2)
				this.categoria = "Inválido";
			else if (getPeso() <= 70.3)
				this.categoria = "Leve";
			else if (getPeso() <= 83.9)
				this.categoria = "Médio";
			else if (getPeso() <= 120.2)
				this.categoria = "Pesado";
			else
				categoria = "Invalido";
		}
		public int getVitorias() {
			return vitorias;
		}
		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		public int getEmpates() {
			return empates;
		}
		public void setEmpates(int empates) {
			this.empates = empates;
		}
	
}
