package HERENCIA;

public class Estudiante extends Persona{

	
	String carrera ;
	
	public Estudiante(int edad, String nombre, String carrera) {
		super(edad, nombre);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
}
