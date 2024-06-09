package flashcards;

import java.time.LocalDate;
import java.util.List;

public class Cartao {
	//Atributos
		private String frente;
		private String verso;
		private String materia;
		private String tema;
		private LocalDate dataARevisar;
		private LocalDate dataCriacao;
		private String codigo;
		private int revisoesRealizadas;
		private List<String> tags;
		private String linkImagem;
		private String linkAudio;
		private String linkVideo;
		private String comentarios;
		private String categoria;

		
		//Método Construtor
		
		public Cartao(String frente, String verso, String materia, String tema, String codigo) {
			super();
			this.frente = frente;
			this.verso = verso;
			this.materia = materia;
			this.tema = tema;
			this.dataARevisar = LocalDate.now().minusDays(1);
			this.dataCriacao = LocalDate.now();
			this.codigo = codigo;
			this.revisoesRealizadas = 0;
		}
		//Métodos Especiais 
		
		@Override
		public String toString() {
			return "Cartao [frente=" + frente + ", verso=" + verso + ", materia=" + materia + ", tema=" + tema
					+ ", dataARevisar=" + dataARevisar + ", dataCriacao=" + dataCriacao + ", codigo=" + codigo
					+ ", revisoesRealizadas=" + revisoesRealizadas + ", tags=" + tags + ", linkImagem=" + linkImagem
					+ ", linkAudio=" + linkAudio + ", linkVideo=" + linkVideo + ", comentarios=" + comentarios
					+ ", categoria=" + categoria + "]";
		}
		
		public String getFrente() {
			return frente;
		}
		
		
		public void setFrente(String frente) {
			this.frente = frente;
		}
		public String getVerso() {
			return verso;
		}
		public void setVerso(String verso) {
			this.verso = verso;
		}
		public String getMateria() {
			return materia;
		}
		public void setMateria(String materia) {
			this.materia = materia;
		}
		public String getTema() {
			return tema;
		}
		public void setTema(String tema) {
			this.tema = tema;
		}
		public LocalDate getDataARevisar() {
			return dataARevisar;
		}
		public void setDataARevisar(LocalDate dataARevisar) {
			this.dataARevisar = dataARevisar;
		}
		public LocalDate getDataCriacao() {
			return dataCriacao;
		}
		public void setDataCriacao(LocalDate dataCriacao) {
			this.dataCriacao = dataCriacao;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public int getRevisoesRealizadas() {
			return revisoesRealizadas;
		}
		public void setRevisoesRealizadas(int revisoesRealizadas) {
			this.revisoesRealizadas = revisoesRealizadas;
		}
		public List<String> getTags() {
			return tags;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		}
		public String getLinkImagem() {
			return linkImagem;
		}
		public void setLinkImagem(String linkImagem) {
			this.linkImagem = linkImagem;
		}
		public String getLinkAudio() {
			return linkAudio;
		}
		public void setLinkAudio(String linkAudio) {
			this.linkAudio = linkAudio;
		}
		public String getLinkVideo() {
			return linkVideo;
		}
		public void setLinkVideo(String linkVideo) {
			this.linkVideo = linkVideo;
		}
		public String getComentarios() {
			return comentarios;
		}
		public void setComentarios(String comentarios) {
			this.comentarios = comentarios;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		
		//Métodos
		
		public void exibirDetalhes() {
	        System.out.println("Frente: " + frente);
	        System.out.println("Verso: " + verso);
	        System.out.println("Matéria: " + materia);
	        System.out.println("Tema: " + tema);
	        System.out.println("Data a revisar: " + dataARevisar);
	        System.out.println("Data de criação: " + dataCriacao);
	        System.out.println("Código: " + codigo);
	        System.out.println("Revisões realizadas: " + revisoesRealizadas);
	        System.out.println("--------------");
	    }
		
		public boolean precisaDeRevisao() {
		    LocalDate hoje = LocalDate.now();
		    return hoje.isAfter(dataARevisar);
		}
		public void limparComentarios() {
		    this.comentarios = null;
		}
		public void definirCategoria(String novaCategoria) {
		    this.categoria = novaCategoria;
		}
		public void incrementarRevisoesRealizadas() {
		    this.revisoesRealizadas++;
		}
		public void atualizarDataRevisao() {
		    this.dataARevisar = dataARevisar.plusDays(5);
		}
		public void atualizarDataPrimeiraRevisao() {
		    this.dataARevisar = dataARevisar.plusDays(1);
		}
		public void atualizarDataSegundaRevisao() {
		    this.dataARevisar = dataARevisar.plusDays(3);
		}
		public void atualizarDataQuartaRevisao() {
		    this.dataARevisar = dataARevisar.plusDays(4);
		}
		public void adicionarLinksMultimidia(String linkImagem, String linkAudio, String linkVideo) {
		    this.linkImagem = linkImagem;
		    this.linkAudio = linkAudio;
		    this.linkVideo = linkVideo;
		}
		public void adicionarComentario(String comentario) {
		    this.comentarios = comentario;
		}
		public void removerTag(String tag) {
		    tags.remove(tag);
		}
		public void adicionarTag(String tag) {
		    tags.add(tag);
		}
		



		
		
}
