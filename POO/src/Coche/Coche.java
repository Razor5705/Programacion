package Coche;

public class Coche {
// Modificador de variables, los convierte en un private
	private int ruedas;
	private int largo;
	private int Ancho;
    private int motor;
    private int peso;
// Aca hay tres variables mas de otro tipo
String color;
int peso_total;
boolean asientos_cuero, climatizador;


public Coche() {
	
	Ancho = 250;
	largo = 400;
	ruedas = 4;
	motor = 200;
	peso = 1900;
	
}

// GETTERS (Dame los valores)

public int getAncho() {
	return Ancho;
}

public int getruedas() {
	return ruedas;
}

public int getlargo() {
	return largo;
}

public int getmotor() {
	return motor;
}

public int getpeso() {
	return peso;
}

//SETTERS 

public String set_motor() {
	
	return "El motor del coche tiene " + motor + " caballos de potencia"; 
}

public String set_Ancho() {
	
	return "El ancho del coche es de " + Ancho + " cm "; 
}

public String set_ruedas(){
	
	return "El coche tiene " + ruedas + " ruedas "; 
}

public String set_largo() {
	
	return "El largo del coche es de " + largo + " cm "; 
}

public String set_peso() {
	
	return "El peso del coche es de  " + peso + " kg "; 
}

public void estableceColor() { //SETTER
	color = "Rojo";
}

public String set_color() { //GETTER
	return "El color de tu coche es " + color;
}

}

