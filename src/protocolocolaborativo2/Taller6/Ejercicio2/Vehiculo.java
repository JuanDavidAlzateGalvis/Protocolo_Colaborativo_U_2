/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller6.Ejercicio2;

/**
 *
 * @author juana
 */
public class Vehiculo {
    
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    protected void mostrarDetalles() {
        System.out.println("Tipo de vehiculo: " + tipo);
        System.out.println("Marca de vehiculo: " + marca);
    }
}
