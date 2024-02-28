package EJERCFICIOS_RAYO;

import java.util.HashMap;
import java.util.Scanner;

public class DiccionarioCastellanoIngles {

	static Scanner sc = new Scanner (System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String, String> lista = new HashMap<String, String>();
     String Castellano, Ingles;
    
     while (true){
       System.out.println("Dime la palabra en castellano");
       Castellano = sc.nextLine();
       
       if(Castellano.compareToIgnoreCase("FIN") == 0) 
       break;
       
       System.out.println();
       
       if(lista.containsKey(Castellano)) {
    	   System.out.println();
    	   System.out.println("La traduccion es "+lista.get(Castellano));
       } else {
    	 System.out.println("Dime la traduccion");
        Ingles = sc.nextLine();
        lista.put(Castellano, Ingles);
        
        System.out.println();
        
       }
     }
	}

}
