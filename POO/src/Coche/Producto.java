package Coche;

public class Producto {

	private String nombre;
	private Double precio;
	private int stock;
	
	public Producto() {
		
		nombre = "GTX 1080 Ti";
		precio = 900.00;
		stock = 16;
	}
	
	// GETTERS
	
	public String getnombre() {
		return nombre;
	}
	
	public Double getprecio() {
		return precio;
	}
	
	public int getstock() {
		return stock;
	}
	
	// SETTERS
	
	public void set_nombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void set_precio(Double precio) {
		
		this.precio = precio;
	}
	
	public void set_stock(int stock) {
		if(stock >= 0) {
			this.stock = stock;
		} else {
			System.out.println("El numero no debe ser negativo");
		}
	}
}
