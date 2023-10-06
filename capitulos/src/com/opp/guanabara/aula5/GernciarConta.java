package com.opp.guanabara.aula5;

import javax.annotation.processing.SupportedSourceVersion;

public class GernciarConta {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		ContaBanco c2 = new ContaBanco();
        
		System.out.println("Abrir conta");
		
		
		c1.abrirConta("CP", 200);
		c2.abrirConta("CC", 500);
		
		c1.status();
		System.out.println();
		c2.status();
		
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("Depositar 200 e 125");
		
		c1.depositar(-100);
		c2.depositar(-200);
		
		c1.status();
		System.out.println();
		c2.status();
		
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("sacar 100 e 122");
		
		c1.sacar(300);
		c2.sacar(550);
		
		c1.status();
		System.out.println();
		c2.status();
		
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("Pagar mensalidade");
		
		c1.pagarMensalidade();
		c2.pagarMensalidade();
		
		c1.status();
		System.out.println();
		c2.status();
		
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("fechar conta");
		
		c1.fecharConta();
		c2.fecharConta();
		
		c1.status();
		System.out.println();
		c2.status();
		
		System.out.println("-----------------------------------------");
		System.out.println("Pagando Mensalidade: ");
		System.out.println();
		c1.depositar(20);
		c2.depositar(12);
		
		c1.status();
		System.out.println();
		c2.status();
		
		System.out.println("-----------------------------------------");
		System.out.println("Fechando a conta: ");
		System.out.println();
		c1.fecharConta();
		c2.fecharConta();
		
		c1.status();
		System.out.println();
		c2.status();
		System.out.println();
		c1.pagarMensalidade();
		System.out.println();
		c1.status();
		
		
		
		
		
		

	}

}
