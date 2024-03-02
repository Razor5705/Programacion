package CONTRUSCTOR;

import javax.swing.JOptionPane;

public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Coche coche1 = new Coche("Tiggo" ,"7pro" , 2020 , "Rojo" );
     Coche coche2 = new Coche("Renault" ,"30" , 2015 );
     Coche coche3 = new Coche("Mazda" ,"MX-5" );
     Coche coche4 = new Coche("Nissan");
     Coche coche5 = new Coche();
     
     JOptionPane.showMessageDialog(null, "Coche 1:\nMarca: " + coche1.marca + "\nModelo: " 
     + coche1.modelo + "\nAño: "
    		 + coche1.año + "\ncolor: " + coche1.color);
     JOptionPane.showMessageDialog(null, "Coche 2:\nMarca: " + coche2.marca + "\nModelo: " 
    	     + coche2.modelo + "\nAño: "
    	    		 + coche2.año + "\ncolor: " + coche2.color);
     JOptionPane.showMessageDialog(null, "Coche 3:\nMarca: " + coche3.marca + "\nModelo: " 
    	     + coche3.modelo + "\nAño: "
    	    		 + coche3.año + "\ncolor: " + coche3.color);
     JOptionPane.showMessageDialog(null, "Coche 4:\nMarca: " + coche4.marca + "\nModelo: " 
    	     + coche4.modelo + "\nAño: "
    	    		 + coche4.año + "\ncolor: " + coche4.color);
     JOptionPane.showMessageDialog(null, "Coche 5:\nMarca: " + coche5.marca + "\nModelo: " 
    	     + coche5.modelo + "\nAño: "
    	    		 + coche5.año + "\ncolor: " + coche5.color);

     
	}

}

class Coche {
	
	String marca;
	String modelo;
	int año;
	String color;
	
	/**
	 * @param marca
	 * @param modelo
	 * @param año
	 * @param color
	 */
	public Coche(String marca, String modelo, int año, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
	}
	
	public Coche(String marca, String modelo, int año) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = "Sin Color";
	}
	
	public Coche(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.año = 0;
		this.color = "Sin Color";
	}
	
	public Coche(String marca) {
		
		this.marca = marca;
		this.modelo = "Modelo Desconocido";
		this.año = 0;
		this.color = "Sin Color";
	}
	
	public Coche() {
		super();
		this.marca = "Sin Marca";
		this.modelo = "Modelo Desconocido";
		this.año = 0;
		this.color = "Sin Color";
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
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
