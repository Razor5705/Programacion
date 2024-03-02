package pruebas;

import javax.swing.JOptionPane;

public class Balotaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nombre1 = JOptionPane.showInputDialog("Ingresa el nombre del votante 1 ") ;
        String nombre2 = JOptionPane.showInputDialog("Ingresa el nombre del votante 2 ") ;
        String nombre3 = JOptionPane.showInputDialog("Ingresa el nombre del votante 3 ") ;

        JOptionPane.showMessageDialog(null,"Los votantes son " + nombre1 +
        		" / " + nombre2 + " / " + nombre3);
		
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de "+ nombre1)) ;
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de "+ nombre2)) ;
        int edad3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de "+ nombre3)) ;

        Comprobador Usuario1 = new Comprobador(edad1);
        Comprobador Usuario2 = new Comprobador(edad2);
        Comprobador Usuario3 = new Comprobador(edad3);
        
        System.out.println();
        System.out.println(Usuario1.ComprobarEdad());
        System.out.println();
        System.out.println(Usuario2.ComprobarEdad());
        System.out.println();
        System.out.println(Usuario3.ComprobarEdad());
        
	}

}

class Comprobador {
	private final int edadmin = 18;
	private int edad;
	
	public Comprobador(int edad) {
		this.edad = edad;
	}
	
	public String ComprobarEdad() {
		if (edad < edadmin) {
			return "En este Balotaje, esta edad no es elegible para votar";
		} else {
		return "Si puedes votar en este Balotaje. Eres Elegido, Dale! ";
		}
	}
	
	public int getEdadmin() {
		return edadmin;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}