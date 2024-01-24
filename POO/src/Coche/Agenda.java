package Coche;

public class Agenda {

	private String nombreContacto;
	private int numtel;
	private String email;
	
	
	//GETTERS
	
	public Agenda(String nombreContacto, int numtel, String email) {
		this.nombreContacto = nombreContacto;
		this.numtel = numtel;
		this.email = email;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}
	
	public int getNumtel() {
		return numtel;
	}
	
	public String getEmail() {
		return email;
	}
	
	// SETTERS
	
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	
	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
