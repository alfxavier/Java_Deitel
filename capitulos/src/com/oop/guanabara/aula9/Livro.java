package com.oop.guanabara.aula9;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totalPaginas=" + totalPaginas + ", paginaAtual="
				+ paginaAtual + ", aberto=" + aberto + ", leitor=" + leitor + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	
	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		this.paginaAtual = p;
		
	}

	@Override
	public void avancarPag() {
		this.paginaAtual++;
		
	}

	@Override
	public void voltarPag() {
		this.paginaAtual--;
		
	}
	
	
}
