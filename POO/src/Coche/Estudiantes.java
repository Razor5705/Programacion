package Coche;

import javax.swing.JOptionPane;

public class Estudiantes {

	public static void main(String[] args) {
		Curso[] notas = new Curso[5];

        for (int i = 0; i < 5; i++) {
            String nombrecurso = JOptionPane.showInputDialog("Ingresa el nombre del curso " + (i + 1));
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion " + (i + 1)));

            // Crear un objeto Curso y asignar valores
            Curso curso = new Curso(nombrecurso, calificacion);
            notas[i] = curso;
        }

        for (Curso curso : notas) {
            // Mostrar información utilizando el método mostrarinfo() de la clase Curso
            curso.mostrarinfo();
            // Mostrar categoría utilizando el método obtenerCategoriaCalificacion()
            System.out.println("Categoría: " + curso.obtenerCategoriaCalificacion());
        }
    }
}