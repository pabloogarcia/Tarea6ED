/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornostarea6;

/**
 *  Clase Tarea6EDClase
 * @author Pablo
 */
public class Tarea6EDClase {
    
    /**
     * Método que aplica un descuento si el número de productos es mayor a 3.
     * Si el número de productos es mayor a 3, resta 5 al precio, multiplica el precio por 0.8
     * y lo asigna a la variable total, imprime el total y confirma que se ha enviado.
     * Si el número de productos es menor o igual a 3, multiplica el precio por 0.95, 
     * lo asigna a la variable total, imprime el total y confirma que se ha enviado.
     *
     * @param precioProducto El precio del producto.
     * @param numeroProductos El número de productos comprados.
     */
    
    private static final double descuento1 = 0.8;
    private static final double descuento2 = 0.95;

    public void aplicarDescuento(double precioProducto, int numeroProductos) {
        double total = calcularTotal(precioProducto, numeroProductos);
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }

    private double calcularTotal(double precioProducto, int numeroProductos) {
        if (numeroProductos > 3) {
            precioProducto -= 5;
            return precioProducto * descuento1;
        } else {
            return precioProducto * descuento2;
        }
    }
}
    
    
