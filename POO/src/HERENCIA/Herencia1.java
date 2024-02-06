package HERENCIA;

public class Herencia1 {

	public static void main(String[] args) {
     Automovil Ford = new Automovil();
     
     Ford.setAño(2015);
     Ford.setMarca("Ford_Mazda");
     Ford.setTipodecombustible("Gaseoso");
     Ford.setModelo("CX_30");
     
     
     System.out.println(
     Ford.getAño() + " " +
     Ford.getTipodecombustible() + " " +
     Ford.getMarca() + " " +
     Ford.getModelo()
     );
     
	}

}
