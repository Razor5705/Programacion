package HERENCIA;

public class Rectangulo extends Figura{

	int area_rectangulo = 0;
	int base = 10;
	int altura = 20;
	
	
	public String calculararea() {
		area_rectangulo = base*altura;
		return "El area de un rectangulo de base "+base+" y altura "+altura+" es igual a "+area_rectangulo;

	}
}
