package capitulo_04;



public class Criptografia {
	private int somador = 7;
	private int divisor = 10;
	
	public int setCriptografia(int numero){
		int resultado = -1;				
		if (numero <= 9999 || numero >= 1000) {
			int contador = 4;
			int divisorResto = 10;
			int divisorDivisao = 1;
			int total = 0; 
			
			while (contador >= 1) {
							
				total += (((((numero / divisorDivisao) % divisorResto) + somador) % divisor) * divisorDivisao);
							
				divisorDivisao *= divisorResto;
				
				contador--;
			}
	
			
			int p4 = (total / 1) % 10;
			int p3 = (total / 10) % 10;
			int p2 = (total / 100) % 10;
			int p1 = (total / 1000) % 10;
			
			resultado = p2 + (p1 * 10) + (p4 * 100) + (p3 * 1000);
						
		}
					
	return resultado;
	}
	
	public int descriptografar(int numero) {
		int resultado = 0;
		if (numero <= 9999 || numero >= 0) {
			//colocar os numeros em ordem
			int p4 = (numero / 100) % 10;
			int p3 = (numero / 1000) % 10;
			int p2 = (numero / 1) % 10;
			int p1 = (numero / 10) % 10;
			numero = (p1 * 1000) + (p2 * 100) + (p3 * 10) + p4;  
			
			// dividir por 10 e diminuir de 7		
			int contador = 4;
			int divisorResto = 10;
			int divisorDivisao = 1;
					
			while (contador >= 1) {
				int total = (numero / divisorDivisao) % divisorResto;
				
				if (total == 8) {
					total = 1;
				}else if (total == 9) {
					total = 2;
				}else if (total == 0) {
					total = 3;
				} else { 
					total = total + 3;
				}
				
				resultado += (total * divisorDivisao); 
				
				
				
				divisorDivisao *= divisorResto;
				contador--;
			}
			
		}
		
		
		
		return resultado;
	}
}
