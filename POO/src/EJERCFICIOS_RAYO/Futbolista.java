package EJERCFICIOS_RAYO;

public class Futbolista extends SeleccionFutbol{
 /**
	 * @param dorsal
	 * @param demarcacion
	 */
private int dorsal;
 private String demarcacion;
 
 
 @Override
public String toString() {
	StringBuffer cadena = new StringBuffer("F dorsal= " + dorsal + "\n" );
	cadena.append(" demarcacion= " + demarcacion + "\n");
	cadena.append(super.toString());
	return cadena.toString();
}

public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
	 super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
 

@Override
public void concentrarse() {
	// TODO Auto-generated method stub
System.out.println("Concentrarse (Clase Futbolista). ");
}

@Override
public void viajar() {
	// TODO Auto-generated method stub
	   System.out.println("Viajar (Clase Futbolista). ");

}

@Override
public void entrenar() {
	// TODO Auto-generated method stub
	   System.out.println("Entrenarse (Clase Futbolista). ");

}

@Override
public void jugarPartido() {
	// TODO Auto-generated method stub
	   System.out.println("Asistir al partido (Clase Futbolista). ");

}
public int getDorsal() {
	return dorsal;
}
public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}
public String getDemarcacion() {
	return demarcacion;
}
public void setDemarcacion(String demarcacion) {
	this.demarcacion = demarcacion;
}
}
