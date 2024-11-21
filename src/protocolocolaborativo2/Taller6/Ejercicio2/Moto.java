/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller6.Ejercicio2;

/**
 *
 * @author juana
 */
public class Moto extends Vehiculo {

    protected int cilindrada;
    
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion() {
        mostrarDetalles();
        System.out.println("Cilindrada: " + cilindrada);
    }
}