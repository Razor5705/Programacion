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
