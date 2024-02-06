package HERENCIA;

public class Vehiculo {
     String marca;
     String modelo;
     int año;
     
     public Vehiculo() {
    	  marca = "Ford_Mazda";
    	  modelo = "CX_30";
    	  año = 2015;
     }
     
     public Vehiculo(String marca, String modelo, int año) {
    	 this.marca = marca;
    	 this.modelo = modelo;
    	 this.año = año;
     }
     
     
     public int getAño() {
 		return año;
 	}
     
     public void setAño(int año) {
		this.año = año;
	}
     
     public String getMarca() {
		return marca;
	}
     
     public void setMarca(String marca) {
		this.marca = marca;
	}
     
     public String getModelo() {
		return modelo;
	}
     
     public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
