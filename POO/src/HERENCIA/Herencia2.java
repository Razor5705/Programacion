package HERENCIA;

public class Herencia2 {

	public static void main(String[] args) {
        
		Estudiante estudiante1 = new Estudiante(19, "Jose", "Ingeniería Informática");

		System.out.println("Edad: " +estudiante1.getEdad());
		System.out.println("Nombre: " + estudiante1.getNombre());
		System.out.println("Carrera: " +  estudiante1.getCarrera());

	
	}

}
