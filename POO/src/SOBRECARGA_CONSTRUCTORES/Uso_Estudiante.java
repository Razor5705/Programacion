package CONTRUSCTOR;

import javax.swing.JOptionPane;

public class Uso_Estudiante {

	public static void main(String[] args) {
  Estudiante estudiante1 = new Estudiante("Nikolas", 18, 9.0 );
Estudiante estudiante2 = new Estudiante("MESSI");
Estudiante estudiante3 = new Estudiante();

	JOptionPane.showMessageDialog(null, "Estudiante 1:\nNombre: "
    	     + estudiante1.nombre + "\nEdad: " + estudiante1.edad + "\nPromedio: " 
    	    		 + estudiante1.promedio);;	
    	    		 
     JOptionPane.showMessageDialog(null, "Estudiante 2:\nNombre: "
    	    	    + estudiante2.nombre + "\nEdad: " + estudiante2.edad + "\nPromedio: " 
    	    	   	 + estudiante2.promedio);;	
    	    	   	 
     JOptionPane.showMessageDialog(null, "Estudiante 3:\nNombre: "
    	     	    	    + estudiante3.nombre + "\nEdad: " + estudiante3.edad + "\nPromedio: " 
    	     	    	   	 + estudiante3.promedio);;	   	    	   	 

	}

}

class Estudiante {
	
	/**
	 * @param nombre
	 * @param edad
	 * @param promedio
	 */
	public Estudiante(String nombre, int edad, double promedio) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
	}
	
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
		this.edad = 17;
		this.promedio = 6.5;
	}
	
	public Estudiante() {
		this.nombre = "Ejemplo";
		this.edad = 16;
		this.promedio = 8.0;
	}
	
	
	String nombre;
	int edad;
	double promedio;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	
}