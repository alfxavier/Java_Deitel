package capitulo_04;
import java.util.Scanner;
public class QuilometragemCombustivel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double KmL = 0.0;
		int KmPercorrido = 0;
		int ConsumoLitros = 0;
		int somaKmPercorrido = 0;
		int somaConsumoLitros = 0;
		
		System.out.print("Informa a quilometragem percorrida ou -1 para sair: ");
		KmPercorrido = input.nextInt();
		System.out.printf("%nInforma o consumo em Litros ou -1 para sair: ");
		ConsumoLitros = input.nextInt();
				
		while (KmPercorrido != -1 || ConsumoLitros != -1) {
			//calcula a kml
			double Kml = (double) KmPercorrido / ConsumoLitros;
			// somatorio dos percursos 
			somaKmPercorrido += KmPercorrido;
			somaConsumoLitros += ConsumoLitros;
			//impressão dos valores
			System.out.printf("%nO consumo atual é de %.2f. "
					+ "%nTotal de Km percorrido é de %d. "
					+ "%nTotal de Litros consumido é de %d", Kml, somaKmPercorrido, somaConsumoLitros);
			//solicitação de novos valores
			System.out.printf("%nInforma a quilometragem percorrida ou -1 para sair: ");
			KmPercorrido = input.nextInt();
			System.out.printf("%nInforma o consumo em Litros ou -1 para sair: ");
			ConsumoLitros = input.nextInt();
			
		}
		
		double KmlTotal = (double) somaKmPercorrido / somaConsumoLitros;
		System.out.printf("O total de consumo da viagem em Km/l foi de %.2f", KmlTotal);
			
	}

}
