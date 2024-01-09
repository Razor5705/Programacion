/**
 * 
 */
package aaa;

import java.util.Scanner;

/**
 * 
 */
public class aaa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[][] asientos = new char[15][15];
	     inicializarAsientos(asientos); // Inicializar todos los asientos como libres
	     
	        boolean salir = false;
	        Scanner scanner = new Scanner(System.in);
	        
	        while (!salir) {
	            mostrarAsientos(asientos); // Mostrar la matriz de asientos en la consola

	            System.out.println("Ingrese el número de fila (0-9):");
	            int fila = scanner.nextInt();

	            System.out.println("Ingrese el número de columna (0-9):");
	            int columna = scanner.nextInt();

	            if (verificarAsiento(asientos, fila, columna)) {
	                marcarAsiento(asientos, fila, columna); // Marcar el asiento como ocupado
	            } else {
	                System.out.println("El asiento seleccionado está ocupado o no existe.");
	            }

	            System.out.println("¿Desea salir? (S/N)");
	            String opcion = scanner.next();

	            if (opcion.equalsIgnoreCase("S")) {
	                salir = true;
	            }
	        }

	        scanner.close();
	    }
     
	    public static void inicializarAsientos(char[][] asientos) {
	        for (int i = 0; i < asientos.length; i++) {
	            for (int j = 0; j < asientos[i].length; j++) {
	                asientos[i][j] = 'L'; // Inicializar todos los asientos como libres
	            }
	        }
	    }

	    public static void mostrarAsientos(char[][] asientos) {
	        for (int i = 0; i < asientos.length; i++) {
	            for (int j = 0; j < asientos[i].length; j++) {
	                System.out.print(asientos[i][j] + " "); // Mostrar el estado de cada asiento
	            }
	            System.out.println();
	        }
	    }

	    public static boolean verificarAsiento(char[][] asientos, int fila, int columna) {
	        if (fila >= 0 && fila < asientos.length && columna >= 0 && columna < asientos[fila].length) {
	            return asientos[fila][columna] == 'L'; // Verificar si el asiento está libre
	        }
	        return false;
	    }

	    public static void marcarAsiento(char[][] asientos, int fila, int columna) {
	        asientos[fila][columna] = 'O'; // Marcar el asiento como ocupado
	    }
	}