package CONTRUSCTOR;

public class Uso_Empleado {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan", 1000, "Ventas");
        Empleado empleado2 = new Empleado("María", 2000);
        Empleado empleado3 = new Empleado("Pedro");
        
        System.out.println("Empleado 1: ");
        System.out.println("El nombre del empleado es: " + empleado1.nombre);
        System.out.println("El salario del empleado es: " + empleado1.Salario);
        System.out.println("El departamento del empleado es: " + empleado1.departamento);
        
        System.out.println("\nEmpleado 2:");
        System.out.println("El nombre del empleado es: " + empleado2.nombre);
        System.out.println("El salario del empleado es: " + empleado2.Salario);
        System.out.println("El departamento del empleado es: " + empleado2.departamento);
        
        System.out.println("\nEmpleado 3:");
        System.out.println("El nombre del empleado es: " + empleado3.nombre);
        System.out.println("El salario del empleado es: " + empleado3.Salario);
        System.out.println("El departamento del empleado es: " + empleado3.departamento);
	}

}

class Empleado {
	String nombre;
	double Salario;
	String departamento;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	public Empleado(String nombre, double Salario, String departamento) {
		this.nombre = nombre;
        this.Salario = Salario;
        this.departamento = departamento;
	}
	
	public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.Salario = salario;
        this.departamento = "Sin departamento";
    }
    
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.Salario = 0;
        this.departamento = "Sin departamento";
    }
	
	
}
