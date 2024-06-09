package flashcards;

import java.time.LocalDate;
import java.util.Scanner;

public class Estudar {
	//Atributos
	private Cartao[] c;
	private LocalDate dataHoje;
	
	//Metodos
	//Iniciar estudos
	public void iniciarEstudos(Cartao[] c) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iniciando os estudos.");
		System.out.println("****************************");
		
		int index = 0;
        LocalDate dataHoje = LocalDate.now();

        // Loop principal
        while (index < c.length) { //CRIA UM LOOP COM UM INDICE PARA SER PREENCHIDO SE O CARTÃO NÃO FOI MAIS USADO
        	for (int i = 0; i < c.length; i++) {
        		if (c[i].getDataARevisar().isBefore(dataHoje)) {	//VERIFICA SE O CARTÃO ESTÁ ESTÁ VENCIDO E DEVE SER REVISADO
        			System.out.println(c[i].getFrente()); //MOSTRA A FRENTE DO CARTÃO
        			System.out.println("");
        			System.out.println("------------------------------");
                    System.out.println("Você quer virar este cartão? (S para Sim, qualquer outra tecla para sair)");
        			String respostaUsuario = scanner.nextLine(); 
        			
        			
        			if (respostaUsuario.equals("S")) {
        				System.out.println("------------------------------");
        				System.out.println(c[i].getVerso()); //MOSTRA A RESPOSTA DO CARTÃO
        				System.out.println("------------------------------");
        				System.out.println("Você quer repetir este cartão? (S para Sim, qualquer outra tecla para sair)");
            			respostaUsuario = scanner.nextLine();
        				if (respostaUsuario.equals("S")) { // RETORNA O LOOP E O CARTÃO SERÁ REPETIDO
        					System.out.println("------------------------------");
        				}else { 
        					c[i].setDataARevisar(dataHoje.plusDays(1)); //ENCERRA O LOOP E COLOCA O CARTÃO PARA UMA DATA POSTERIOR
        					index++; //INCREMENTA O INDICE PARA FINALIZAR O LOOP. 
        					System.out.println("------------------------------");
        				}
        				
        			} else {
        			break;
        			}
        		
        		}
        	}
            
        }
	}
	
	
	
	//Metodos Especiais
	public Cartao[] getC() {
		return c;
	}
	public void setC(Cartao[] c) {
		this.c = c;
	}
	public LocalDate getDataHoje() {
		return dataHoje;
	}
	public void setDataHoje(LocalDate dataHoje) {
		this.dataHoje = dataHoje;
	}
	
	
	
}
