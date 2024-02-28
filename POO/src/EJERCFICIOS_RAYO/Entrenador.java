package EJERCFICIOS_RAYO;

public class Entrenador extends SeleccionFutbol {
   private int idfederacion;

public int getIdfederacion() {
	return idfederacion;
}

public void setIdfederacion(int idfederacion) {
	this.idfederacion = idfederacion;
}


public Entrenador(int id, String nombre, String apellidos, int edad, int idfederacion) {
	super(id, nombre, apellidos, edad);
	this.setIdfederacion(idfederacion);
}

@Override
public String toString() {
	String cadena = "Entrenador [idFederacion=" + idfederacion + "]";
	cadena += "\n" + super.toString();
	return cadena;
}

@Override
public void concentrarse() {
	// TODO Auto-generated method stub
System.out.println("Concentrarse (Clase Entrenador). ");
}

@Override
public void viajar() {
	// TODO Auto-generated method stub
	   System.out.println("Viajar (Clase Entrenador). ");

}

@Override
public void entrenar() {
	// TODO Auto-generated method stub
	   System.out.println("Entrenarse (Clase Entrenador). ");

}

@Override
public void jugarPartido() {
	// TODO Auto-generated method stub
	   System.out.println("Asistir al partido (Clase Entrenador). ");

}
   
   
}
