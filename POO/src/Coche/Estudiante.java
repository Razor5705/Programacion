package Coche;

public class Estudiante {

    private String nombre;
    private int edad;
    private Double calificacion;
    
    public Estudiante() {
    	nombre = "Messi";
    	edad = 16;
    	calificacion = 100;
    }
    
    // GETTERS
    
    public String getnombre() {
    	return nombre;
    }
    
    public int getedad() {
    	return edad;
    }
    
    public Double getcalificacion() {
    	return calificacion;
    }
    
    // SETTERS
    
    public void set_nombre(String nombre) {
    	
    	this.nombre = nombre;
    }
    
    public void set_edad(int edad) {
    	
    	if (edad >= 0) {
    		this.edad = edad;
    	} else {
    		System.out.println("La Edad tiene que ser positivo");
    	}
    }
    
    public void set_calificacion(Double calificacion) {
    	if (calificacion < 0 || calificacion > 100) {
    		this.calificacion = calificacion;	
    	} else {
    		System.out.println("Invalido. La calificacion tiene que estar entre el 0 y el 100");
    	}
    }
}
