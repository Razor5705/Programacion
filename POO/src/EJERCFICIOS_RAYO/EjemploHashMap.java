package EJERCFICIOS_RAYO;

import java.util.HashMap;

public class EjemploHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,Integer> lista = new HashMap<String,Integer>();
       
       lista.put("Peras", 10);
       lista.put("Manzanas", 11);
       lista.put("Melocotones", 12);
       lista.put("Kiwis", 13);

       lista.put("Melocotones", 15);

       for(String key : lista.keySet()) {
    	  System.out.println(key + " " + lista.get(key));
       }
	}

}
