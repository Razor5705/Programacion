package Coche;

public class Producto1 {

	private String producto;
	private int cantidad;
	private double precio;
	
	
	// GETTERS
	
	public Producto1(String producto, int cantidad, double precio) {
      this.producto = producto;
      this.cantidad = cantidad;
      this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	// SETTERS
	
	public void setProducto(String producto) {
		this.producto = producto;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// METODOS
	
	public void mostrarinfo() {
	   	  System.out.println("Los Productos ingresados son: " + this.producto);
	      System.out.println();
	      System.out.println("Las Cantidades de cada producto son: " + this.cantidad);
	      System.out.println();
	      System.out.println("El Precio de cada producto es: " + this.precio + " €");
	      System.out.println();

	    }
	
}
