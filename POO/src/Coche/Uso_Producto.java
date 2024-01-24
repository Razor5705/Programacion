package Coche;

import javax.swing.JOptionPane;

public class Uso_Producto {

    public static void main(String[] args) {
        Producto1[] productos = new Producto1[5];

        for (int i = 0; i < productos.length; i++) {
            String producto = JOptionPane.showInputDialog("Ingresa el nombre del producto " + (i + 1));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad exacta " + (i + 1)));
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Determina el precio del producto " + (i + 1)));

            // Crear nuevo objeto para almacenar
            Producto1 inventario = new Producto1(producto, cantidad, precio);
            productos[i] = inventario;
        }

        for (Producto1 inventario : productos) {
            inventario.mostrarinfo();
        }
    }
}