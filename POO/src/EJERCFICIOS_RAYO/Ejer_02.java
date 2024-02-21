package EJERCFICIOS_RAYO;

import java.util.ArrayList;

public class Ejer_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tb[] = {1,2,3,4,5};
     ArrayList<String> lista = new ArrayList<String>();
     
     lista.add("Angel");
     lista.add("Maria");
     lista.add(1,"Miguel");
     lista.add("Mata");
     lista.add("Jose Manuel");
     lista.add("Lucas");
     lista.add("David");
     lista.add(1,"Nikolas");
     lista.add("Poeta");
     lista.add("Francisco MVP");
     
     for (String eLe : lista) {
    	    System.out.println(eLe);
	}
     
     System.out.println();
     
     for (int n : tb) {
 	    System.out.println(n);
	}
     
     System.out.println();

     
     for (int i = 0; i < tb.length; i++) {
		System.out.println(tb[i]);
	}
     
	}

}
