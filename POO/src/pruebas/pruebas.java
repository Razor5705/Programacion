package pruebas;

public class pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Loli");
		Empleados trabajador2 = new Empleados("Indalecio");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());

		trabajador1.cambiarSeccion("Recursos Humanos");
		
	}
}

class Empleados {
	
	private final String nombre;
	private String seccion;
	
	public Empleados(String nom) {
		nombre = nom;
		cambiarSeccion("administracion");
	}

	public String getNombre() {
		return nombre;
	}
	
	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la seccion es " + seccion;
	}
	
	


	public String getSeccion() {
		return seccion;
	}

	public void cambiarSeccion(String seccion) {
		this.seccion = seccion;
	}
	
}