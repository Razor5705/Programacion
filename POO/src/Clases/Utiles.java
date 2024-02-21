package Clases;

public class Utiles {

	public static double redondear(double numero, int n) {
	
		double potencia=Math.pow(10, n);
		return Math.round(numero * potencia) / potencia;		
	
	}
	
	public static double truncar(double numero, int n) {
		
		
		double potencia = Math.pow(10, n);
		return ((int)(numero * potencia)) / potencia;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
