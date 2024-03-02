package CONTRUSCTOR;

import javax.swing.JOptionPane;

public class Uso_Producto {

	public static void main(String[] args) {
             Producto producto1 = new Producto("Pan", 3.0, 4);
    	     Producto producto2 = new Producto("Pizza", 2.5);
    	     Producto producto3 = new Producto("PS2");
    	     Producto producto4 = new Producto();
    	     
    	     JOptionPane.showMessageDialog(null, "Producto 1:\nNombre: "
    	     + producto1.nombre + "\nPrecio: " + producto1.precio + "\nCantidad: " 
    	    		 + producto1.CantidadStock  );
    	     JOptionPane.showMessageDialog(null, "Producto 2:\nNombre: "
    	    	     + producto2.nombre + "\nPrecio: " + producto2.precio + "\nCantidad: " 
    	    	    		 + producto2.CantidadStock  );
    	     JOptionPane.showMessageDialog(null, "Producto 3:\nNombre: "
    	    	     + producto3.nombre + "\nPrecio: " + producto3.precio + "\nCantidad: " 
    	    	    		 + producto3.CantidadStock  );
    	     JOptionPane.showMessageDialog(null, "Producto 4:\nNombre: "
    	    	     + producto4.nombre + "\nPrecio: " + producto4.precio + "\nCantidad: " 
    	    	    		 + producto4.CantidadStock  );
     
		
	}

}

class Producto {
	

	String nombre;
    double precio;
    int CantidadStock;
    
	public Producto(String nombre, double precio, int cantidadStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.CantidadStock = cantidadStock;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.CantidadStock = 0;
	}
	
	public Producto(String nombre) {
		this.nombre = nombre;
		this.precio = 0.0;
		this.CantidadStock = 0;
	}
	
	public Producto() {
		this.nombre = "Desconocido";
		this.precio = 0.0;
		this.CantidadStock = 0;
	}
	
	
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidadStock() {
		return CantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		CantidadStock = cantidadStock;
	}
	
    
    
}