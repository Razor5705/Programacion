package HERENCIA;

public class Persona {
  int edad;
  String nombre;
  
  public Persona(int edad, String nombre) {
	  this.edad = edad;
	  this.nombre = nombre;
  }
  
  public int getEdad() {
	return edad;
}
  
  public String getNombre() {
	return nombre;
}
  
  public void setEdad(int edad) {
	this.edad = edad;
}
  
  public void setNombre(String nombre) {
	this.nombre = nombre;
}
  
}
