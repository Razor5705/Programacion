package EJERCFICIOS_RAYO;

public abstract class SeleccionFutbol implements IntegrantesSeleccionFutbol {

	/**
	 * 
	 */
	public SeleccionFutbol() {
		super();
	}
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
   System.out.println("Concentrarse (Clase Padre). ");
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		   System.out.println("Viajar (Clase Padre). ");

	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		   System.out.println("Entrenarse (Clase Padre). ");

	}

	@Override
	public void jugarPartido() {
		// TODO Auto-generated method stub
		   System.out.println("Asistir al partido (Clase Padre). ");

	}

}
