package CONTRUSCTOR;

import javax.swing.JOptionPane;

public class Rectangulo {

	public static void main(String[] args) {
		
		 Area rectangulo1 = new Area();
	    Area rectangulo2 = new Area(5, 10);
	    Area rectangulo3 = new Area(3, 7);
	        
	    JOptionPane.showMessageDialog(null, "Rectángulo 1:\nAncho: " 
	    + rectangulo1.getAncho() + "\nAltura: " 
	    		+ rectangulo1.getAltura());   
	    JOptionPane.showMessageDialog(null, "Rectángulo 2:\nAncho: " 
	    	    + rectangulo2.getAncho() + "\nAltura: " 
	    	    		+ rectangulo2.getAltura());  
	    JOptionPane.showMessageDialog(null, "Rectángulo 3:\nAncho: " 
	    	    + rectangulo3.getAncho() + "\nAltura: " 
	    	    		+ rectangulo3.getAltura());  
	    
	}

}

class Area {
	
	int ancho;
	int altura;
	
	
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	
	public Area(int altura, int ancho) {
		this.altura = altura;
		this.ancho = ancho;
	}
	
	public Area() {
		this.altura = -1;
		this.ancho = -1;
	}
	
	public void MostrarInfo() {
	 System.out.println("La Dimension del rectangulo es de: " +this.altura + " "+ this.ancho);
	}
}