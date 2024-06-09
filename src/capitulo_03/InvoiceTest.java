package capitulo_03;
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Invoice invoice1 = new Invoice(1, "livro", -10, -25.3);
		
		System.out.printf("Código: %d , Descrição: %s, Quantidade: %d, Preço unitário: $%.2f, Total: $%.2f%n", 
				invoice1.getNumero(), invoice1.getDescricao(), invoice1.getQuantidade(), 
				invoice1.getPreco(), invoice1.getInvoiceAmount());
		
		System.out.print("Insira um código: ");
		int numero = input.nextInt();
		invoice1.setNumero(numero);
		
		System.out.print("Insira uma descrição do item: ");
		String descricao = input.next();
		invoice1.setDescricao(descricao);
		
		System.out.print("Insira a quantidade: ");
		int quantidade = input.nextInt();
		invoice1.setQuantidade(quantidade);
		
		System.out.print("Insira o preço do produto: ");
		double preco = input.nextDouble();
		invoice1.setPreco(preco);
		
		System.out.printf("Código: %d , Descrição: %s, Quantidade: %d, Preço unitário: %.2f, Total: %.2f%n", 
				invoice1.getNumero(), invoice1.getDescricao(), invoice1.getQuantidade(), 
				invoice1.getPreco(), invoice1.getInvoiceAmount());

		
	}

}
