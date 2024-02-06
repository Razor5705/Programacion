package HERENCIA;

public class DispositivoElectronico {

	String fabricante;
	int añodeFabricacion; 
	
	public DispositivoElectronico(String fabricante, int añodeFabricacion) {
	
		this.añodeFabricacion = añodeFabricacion;
	    this.fabricante =fabricante;
		
	}
}


interface Telefono {
	//LLAMAR
	
	void llamar(String numero);
    void recibirLlamadas();
}