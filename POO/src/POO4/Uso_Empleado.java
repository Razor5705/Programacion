package POO4;

import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
	
}
	
}


class Empleado{
	
	public Empleado(String nombre, double sue, 
			int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		alta_contrato = calendario.getTime();
		
		public String getNombre() {
			return nombre;
		}
		
		public double getsueldo() {
			return sueldo;
		}
		
		public int getagno() {
			return agno;
		}
		
		public int getMes() {
			return mes;
		}
		
		public int getDia() {
			return dia;
		}
		
		
		
		
	}
	
	
	
	
}