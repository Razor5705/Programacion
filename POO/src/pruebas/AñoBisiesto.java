package pruebas;

import javax.swing.JOptionPane;
public class AñoBisiesto {
    public static void main(String[] args) {
    	
        final int Divisor_4 = 4;
        final int Divisor_100 = 100;
        final int Divisor_400 = 400;

        String añoString = JOptionPane.showInputDialog("Introduce un año:");
        int año = Integer.parseInt(añoString);

        if ((año % Divisor_4 == 0 && año % Divisor_100 != 0) || año % Divisor_400 == 0) {
            JOptionPane.showMessageDialog(null, año + " es un año bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, año + " no es un año bisiesto.");
        }
    }
}
