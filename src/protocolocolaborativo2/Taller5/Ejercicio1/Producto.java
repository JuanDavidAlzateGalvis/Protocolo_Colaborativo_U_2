/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller5.Ejercicio1;

/**
 *
 * @author juana
 */
public class Producto {
    
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo(){ 
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Stock del producto: " + stock);
    }
}
