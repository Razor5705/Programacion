package HERENCIA;

public class Herencia4 {

	public static void main(String[] args) {
       Figura figuras [] = new Figura [2];
       figuras [0] = new Circulo ();
       figuras [1] = new Rectangulo ();
       
       Rectangulo ola = new Rectangulo ();
       Circulo circu = new Circulo ();
       
       System.out.println(ola.calculararea());
       System.out.println(circu.calculararea());
       
	}

}
