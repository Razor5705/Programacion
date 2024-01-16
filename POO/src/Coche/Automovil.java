package Coche;

public class Automovil {

	private String marca;
	private String modelo;
	
   public Automovil() {
	   
	   marca = "Tesla";
	   modelo = "Model S";
	   
   }

   // GETTERS 
   
   public String getmarca() {
	   return marca;
   }
   
   public String getmodelo() {
	   return modelo;
   }
   
  // SETTERS
   
   public String set_marca() {
		
		return "La marca del automovil es " + marca; 
	}
   
   public String set_modelo() {
		
		return "El modelo del automovil es " + modelo; 
	}
}

	
	