package Coche;

public class Curso {

	private static final String getCalificacion = null;
	private String nombrecurso;
	private double calificacion;

    public Curso (String nombrecurso, double calificacion) {
    	
    	this.nombrecurso = nombrecurso;
    	this.calificacion = calificacion;
	}
	

    // Getters
    public String getNombreCurso() {
        return nombrecurso;
 
    }
     public double getCalificacion() {
        return calificacion;
    }
     
     // SETTERS
    public void setNombreCurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
     }
    //METODO
    
    public void mostrarinfo() {
   	  System.out.println("Los Cursos: " + this.nombrecurso);
      System.out.println("las Calificaciones: " + this.calificacion);
      System.out.println("Las Calificaciones finales son: " + obtenerCategoriaCalificacion());
    }



	public String obtenerCategoriaCalificacion() {
		int calificacionSobre10 = (int) Math.round(calificacion * 10);

        switch (calificacionSobre10) {
            case 100:
            case 90:
                return "A";
            case 89:
            case 88:
            case 87:
            case 86:
            case 85:
            case 84:
            case 83:
            case 82:
            case 81:
            case 80:
                return "B";
            case 79:
            case 78:
            case 77:
            case 76:
            case 75:
            case 74:
            case 73:
            case 72:
            case 71:
            case 70:
                return "C";
            case 69:
            case 68:
            case 67:
            case 66:
            case 65:
            case 64:
            case 63:
            case 62:
            case 61:
            case 60:
                return "D";
            default:
                return "F";		
	}



}
	
}