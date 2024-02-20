package PRACTICA;

public class SistemadeNotificaciones {

	public static void main(String[] args) {
	CorreoElectronico Correo = new CorreoElectronico("Lucas", "Deseo enviarte este mensaje, este mensajeeee", "Tarea");
	

	}

}

abstract class Notificacion {
	String mensaje;
	String destinatario;
	abstract void enviar();
}

class CorreoElectronico extends Notificacion{

	public CorreoElectronico (String destinatario, String mensaje, String Asunto) {
		this.destinatario = destinatario;
		this.mensaje = mensaje;
	}
		

	@Override
	void enviar() {
		// TODO Auto-generated method stub
		
	}
	
}

class SMS extends Notificacion{

	public SMS (String destinatario, String mensaje, String limiteCaracteres) {
		this.destinatario = destinatario;
		this.mensaje = mensaje;

	}
	
	@Override
	void enviar() {
		// TODO Auto-generated method stub
		
	}
	
}

class NotificarApp extends Notificacion{

	public NotificarApp (String destinatario, String mensaje, String Idenfiticador) {
		this.destinatario = destinatario;
		this.mensaje = mensaje;
	}
	
	@Override
	void enviar() {

	}
	
}