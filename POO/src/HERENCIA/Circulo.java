package HERENCIA;

public class Circulo extends Figura{

	int radio = 5;
	
	public String calculararea() {
		double Area = Math.PI * Math.pow(radio, 2) ; 
        return "El área del circulo es de " + Area;
	}
	
}
