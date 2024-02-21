package EJERCFICIOS_RAYO;

import java.util.ArrayList;

import Clases.Persona;
public class Ejer_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Persona> lista = new ArrayList<Persona>();
       
       lista.add(new Persona("Jose Manuel",25));
       lista.add(new Persona("Ana Jose",25));
       lista.add(new Persona("Jose Andres",25));
       lista.add(new Persona("Ana Maria",25));
       lista.add(new Persona("Itziar",25));
       
       
       for (Persona p : lista) {
    	   System.out.println(p);
		
	}
	}

}
