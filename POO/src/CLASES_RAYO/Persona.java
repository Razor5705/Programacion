package Clases;

public class Persona {
	
	private String Nombre ;
	   @Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", edad=" + edad + "]";
	}
	private int edad;
	
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		super();
		Nombre = nombre;
		this.edad = edad;
	}
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
