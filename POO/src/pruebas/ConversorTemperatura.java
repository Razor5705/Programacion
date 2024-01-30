package pruebas;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		
	    int  temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la temperatura del clima: "));

        Conversor Temperatura = new Conversor(temperatura);

        System.out.println();
        System.out.println(Temperatura.ConvertorF());
		
	}
}

class Conversor {
	private final double factor = 1.8;
	private final int Ajuste = 32;
	private int celsius;
	
	public Conversor (int celsius) {
		this.celsius = celsius;
	}
	
	public String ConvertorF() {
		double Fahrenheit = factor * celsius;
        double Conversion = Fahrenheit + Ajuste;
		return "La temperatura en celsius es " + celsius + "º " +
        		"\nEl Ajuste de Fahrenheit es " + Ajuste + 
        		"\nLa Conversion Final a Fahrenheit es " + Conversion + "º ";
	}
	
	public double getFactor() {
		return factor;
	}
	public int getAjuste() {
		return Ajuste;
	}
	public int getCelsius() {
		return celsius;
	}
	public void setCelsius(int celsius) {
		this.celsius = celsius;
	}
}
