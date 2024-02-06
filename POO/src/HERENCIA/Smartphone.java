package HERENCIA;

public class Smartphone extends DispositivoElectronico implements Telefono{

	public Smartphone(String fabricante, int añodeFabricacion) {
     super(fabricante, añodeFabricacion);
	}

	@Override
	public void llamar(String numero) {
		// TODO Auto-generated method stub
        System.out.println("Llamando al número " + numero);
	}

	@Override
	public void recibirLlamadas() {
		// TODO Auto-generated method stub
        System.out.println("Recibiendo llamadas...");
	}
	
	public void InstalarAplicacion(String aplicacion) {
		System.out.println("Instalando la aplicacion " + aplicacion);
	}
}
