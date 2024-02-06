package HERENCIA;

public class Automovil extends Vehiculo{

	String tipodecombustible;
	
	public Automovil() {
		
	}
	
	public Automovil(String marca, String modelo, int año, String tipodecombustible) {
		super(marca, modelo, año);
		this.tipodecombustible = tipodecombustible;	
	}
	
	public String getTipodecombustible() {
		return tipodecombustible;
	}
	
  public void setTipodecombustible(String tipodecombustible) {
	this.tipodecombustible = tipodecombustible;
   }	

}
