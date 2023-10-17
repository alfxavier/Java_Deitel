package flashcards;



public class Baralho {
	public static void main(String[] args) {
		Cartao[] c = new Cartao[3];
		
		c[0] = new Cartao("O que é um objeto em Java?", "Um objeto é uma instância de uma classe em Java. Ele contém dados na forma de variáveis de instância e comportamentos na forma de métodos.", "Programação Orientada a Objetos", "Conceitos Básicos de Orientação a Objetos", "FC001");
        c[1] = new Cartao("O que é uma classe em Java?", "Uma classe em Java é um modelo para objetos. Ela define os atributos e métodos que os objetos desse tipo terão.", "Programação Orientada a Objetos", "Conceitos Básicos de Orientação a Objetos", "FC002");
        c[2] = new Cartao("Explique o conceito de encapsulamento.", "Encapsulamento em Java é o mecanismo de esconder os detalhes internos de um objeto e restringir o acesso direto aos seus atributos. Isso é feito usando modificadores de acesso como public, private e protected.", "Programação Orientada a Objetos", "Encapsulamento", "FC003");
//        c[3] = new Cartao("O que é herança em Java?", "Herança é um mecanismo pelo qual uma classe pode herdar propriedades e métodos de outra classe. Isso promove a reutilização de código e facilita a criação de hierarquias de classes.", "Programação Orientada a Objetos", "Herança", "FC004");
//        c[4] = new Cartao("O que são interfaces em Java?", "Interfaces em Java são coleções de métodos abstratos. Uma classe pode implementar uma ou mais interfaces, fornecendo implementações para os métodos definidos nessas interfaces.", "Programação Orientada a Objetos", "Interfaces", "FC005");
//        c[5] = new Cartao("Explique o conceito de polimorfismo.", "Polimorfismo em Java permite que objetos de diferentes classes sejam tratados como objetos da mesma classe por meio do uso de herança e interfaces. Isso promove a flexibilidade e extensibilidade do código.", "Programação Orientada a Objetos", "Polimorfismo", "FC006");
//        c[6] = new Cartao("O que é um construtor em Java?", "Um construtor em Java é um método especial chamado quando um objeto de uma classe é instanciado. Ele é usado para inicializar os atributos do objeto.", "Programação Orientada a Objetos", "Construtores", "FC007");
//        c[7] = new Cartao("Qual é a diferença entre `super` e `this` em Java?", "`super` é uma referência à classe pai, enquanto `this` é uma referência à própria instância da classe. `super` é usado para acessar membros da classe pai, enquanto `this` é usado para acessar membros da própria classe.", "Programação Orientada a Objetos", "`super` e `this`", "FC008");
//        c[8] = new Cartao("O que são métodos estáticos em Java?", "Métodos estáticos em Java pertencem à classe em vez de uma instância específica. Eles podem ser chamados diretamente na classe sem a necessidade de criar um objeto da classe.", "Programação Orientada a Objetos", "Métodos Estáticos", "FC009");
//        c[9] = new Cartao("O que é a sobrecarga de métodos em Java?", "Sobrecarga de métodos em Java permite que você defina vários métodos na mesma classe com o mesmo nome, mas com diferentes parâmetros. O método chamado é determinado pelo número e tipo de argumentos.", "Programação Orientada a Objetos", "Sobrecarga de Métodos", "FC010");

				
				
		Estudar e = new Estudar();
		
		e.iniciarEstudos(c);
	}
	
	
	
	
}
