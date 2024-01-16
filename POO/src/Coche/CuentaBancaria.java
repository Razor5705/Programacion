package Coche; 

public class CuentaBancaria {

	private String Titular;
	private Double saldo;
	
	public CuentaBancaria() {
		
		Titular = "BBVA";
		saldo = 9999.99;
	}
	
	// GETTERS
	
	public String getTitular() {
		return Titular;
	}
	
	public Double getsaldo() {
		return saldo;
	}
	
	// SETTERS
	
	public void set_Titular(String Titular) {
		
		this.Titular = Titular ; 
	}
	
    public void set_saldo(Double saldo) {
		
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			System.out.println("Saldo Invalido. Este saldo no puede ser negativo o nulo");
		}
	}
	
}
