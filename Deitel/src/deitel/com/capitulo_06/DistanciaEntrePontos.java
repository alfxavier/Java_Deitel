package capitulo_06;

public class DistanciaEntrePontos {

	public static void main(String[] args) {
		double x1 = 819421.19;
		double y1 = 8242996.28;
		double x2 = 819421.19;
		double y2 = 8242802.20;
		
		System.out.printf("%.2f metros.",distance(x1, y1, x2, y2));
		

	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		double distancia = 0.0;
		double x = 0.0;
		double y = 0.0;
		if (x1 > x2) {
			x = x1 - x2;
		} else {
			x = x2 - x1;
		}
		
		if (y1 > y2) {
			y = y1 - y2;
		} else {
			y = y2 - y1;
		}
		distancia = Math.hypot(x, y);
		
		return distancia;
	}

}
