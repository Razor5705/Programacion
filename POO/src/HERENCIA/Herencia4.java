package HERENCIA;

public class Herencia4 {

	public static void main(String[] args) {
       Figura figuras [] = new Figura [2];
       figuras [0] = new Circulo ();
       figuras [1] = new Rectangulo ();
       
       Figura ola = new Figura ();
       Circulo circu = new Circulo ();
       
       ola = circu;
       circu = (Circulo) ola;
    	   
       
       
	}

}
