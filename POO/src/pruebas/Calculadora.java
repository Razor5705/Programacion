package pruebas;

import javax.swing.JOptionPane;

public class Calculadora {
	
	public static void main(String[] args) {
		String Pan_Horneado = "Pan Horneado";
		String Pizza = "Pizza Doble Queso";

		JOptionPane.showMessageDialog(null, Pan_Horneado);
		JOptionPane.showMessageDialog(null, Pizza);

		double precioProducto1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del primer producto: "));
        double precioProducto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del segundo producto: "));

        Impuestos Producto1 = new Impuestos(precioProducto1);
        Impuestos Producto2 = new Impuestos(precioProducto2);

        System.out.println(Producto1.Calcular());
        System.out.println();
        System.out.println(Producto2.Calcular());

	}
}

class Impuestos {
	private final double porcentaje = 0.15;
	private double producto;
	
	public Impuestos(double producto) {
		this.producto = producto;
	}
	

	public double getProducto() {
		return producto;
	}
	
	public String Calcular() {
		double impuesto = porcentaje * producto;
        double precioFinal = producto + impuesto;
        return "El Precio del Producto es " + producto + 
        		"\nEl Impuesto es " + impuesto + 
        		"\nEl Precio Final es " + precioFinal;
	}
	
	public void setProducto(double producto) {
		this.producto = producto;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	
}