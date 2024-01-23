package Coche;

public class Calculadora {

	private String nombre;
	private double horasT;
 
	private double tarifaxhora;
	
	 //GETTERS
	
	public String getNombre() {
		return nombre;
	}
	
	public double gethorasT() {
		return horasT;
	}

	public double getTarifaxhora() {
		return tarifaxhora;
	}
	
	public double getSalario() {
		return horasT * tarifaxhora;
	}
	
	//SETTERS
	
	public double hora() {
		return 60.00;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setHoras(double horasT) {
		this.horasT = horasT;
	}
		
    public void setTarifaxhora(double tarifaxhora) {;
        this.tarifaxhora = tarifaxhora; 
	}
	
	public void mostrarinfo() {
		System.out.println("El nombre del consultador del salario es " + this.getNombre());
		System.out.println("Las horas trabajadas en total por el trabajador son " + horasT);
		System.out.println("La tarifa por hora es " + tarifaxhora);
		System.out.println("El salario del consultador es " + this.getSalario());

		
	}
	
	
}
