package pruebas;

import javax.swing.JOptionPane;

public class Descuento {

	public static void main(String[] args) {
		
		String Pan_Horneado = "Pan Horneado";
		String Pizza = "Pizza Doble Queso";
		
		JOptionPane.showMessageDialog(null, Pan_Horneado + " \n "+ Pizza);
	
		
		double precioProducto1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del primer producto: "));
		int cantidades1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad del primer producto: "));
        double precioProducto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del segundo producto: "));
        int cantidades2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad del segundo producto: "));
        
        PrecioDescuento CantidadProducto1 = new PrecioDescuento(precioProducto1,cantidades1);
        PrecioDescuento CantidadProducto2 = new PrecioDescuento(precioProducto2,cantidades2);
        
        System.out.println(CantidadProducto1.DescontarProducto());
        System.out.println();
        System.out.println(CantidadProducto2.DescontarProducto());

	}
}

class PrecioDescuento {
 
   private final double porcentaje = 0.10 ;
	private double precio;
	private int cantidades;
	
	
	public PrecioDescuento(double precio, int cantidades) {
		this.precio = precio;
		this.cantidades = cantidades;
	}
	
	
	public double getPorcentaje() {
		return porcentaje;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String DescontarProducto() {
		double descuento = porcentaje * precio;
        double descuentoTotal = descuento * cantidades;
        double precioFinal = precio - descuentoTotal;

        return "El Descuento del Producto es " + descuento +
                "\nEl Descuento total para " + cantidades + " unidades es " + descuentoTotal +
                "\nEl Precio total con el descuento es " + precioFinal;
	}
	public int getCantidades() {
		return cantidades;
	}
	public void setCantidades(int cantidades) {
		this.cantidades = cantidades;
	}
}
