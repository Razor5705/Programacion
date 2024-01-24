package Coche;

import javax.swing.JOptionPane;

public class Uso_Agenda {

	public static void main(String[] args) {
    Agenda[] Agendario = new Agenda[5];
    int cantidadcon = 0;
		
    while(true) {
    	String opciones = JOptionPane.showInputDialog(
    			"Selecciona una opcion:\n" +
    	             "1. Añadir contacto:\n " +
    	             "2. Buscar contacto:\n " +
    	             "3. Mostrar contacto:\n " +
    	             "4. Salir ");
    	
    	int opcion = Integer.parseInt(opciones);
    	
    	switch(opcion) {
    	
    	case 1:
    		if(cantidadcon < Agendario.length ) {
    	    	String nombreContacto= JOptionPane.showInputDialog("Ingresa el nombre del contacto ");
    	    	int numtel = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de telefon "));
    	    	String email = JOptionPane.showInputDialog("Ingresa tu email ");
    	    	
    	    	Agendario[cantidadcon++] = new Agenda(nombreContacto, numtel, email);
    	    	
    	    	JOptionPane.showMessageDialog(null, "Contacto añadido correctamente");
    	    	} else {
    	    		JOptionPane.showMessageDialog(null, "Los Contactos estan llenos. No se pueden añadir mas contactos");	
    	    	}
    		
    	case 2:
    		String buscarnombre = JOptionPane.showInputDialog("Ingresa el nombre que quieres buscar ");
    		boolean encontrado = false;
    		
    		for(int i = 0; i < cantidadcon; i++) {
    			if(Agendario[i].getNombreContacto().equalsIgnoreCase(buscarnombre) ) {
        	    	 JOptionPane.showMessageDialog(null, "Contacto encontrado:\n " +
    			"Nombre: " + Agendario[i].getNombreContacto() + 
    			"\nTelefono: " + Agendario[i].getNumtel() + 
    			"\nEmail: " + Agendario[i].getEmail());
        	    	
        	         	    	
        	    	encontrado = true;
        	    	break;
        	    	} 
    		
    			if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "El Contacto no se encuentra.");
                }
                break;
    		}
    		
    	case 3:
    		StringBuilder listaCon = new StringBuilder("Lista de contactos:\n");
    		for(int i = 0; i < cantidadcon; i++) {
    			listaCon.append("Nombre: ").append(Agendario[i].getNombreContacto()).append("\n");
    			listaCon.append("Numero de Telefono: ").append(Agendario[i].getNumtel()).append("\n");
    			listaCon.append("Email: ").append(Agendario[i].getEmail()).append("\n");
    		}
    		
    		JOptionPane.showMessageDialog(null, listaCon.toString());
            break;
    		
    	case 4:
    		JOptionPane.showMessageDialog(null, "Saliendo del menu de contacto");
    	    System.exit(0);
    	    
    	default:
    		JOptionPane.showMessageDialog(null, "Opcion No valido");
    		break;
    	 
    	}
    	
    	
    }
    

	}

}
