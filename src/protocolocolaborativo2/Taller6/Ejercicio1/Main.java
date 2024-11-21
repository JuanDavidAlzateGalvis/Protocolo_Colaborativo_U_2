/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller6.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan Alzate", 2500000);
        Gerente gerente = new Gerente("Uriel Toro", 3200000, "Gerencia");
        
        System.out.println("Ejercicio 1");
        System.out.println("\nInformacion del empleado: ");
        System.out.println("");
        empleado.mostrarDetalles();
        System.out.println("");
        
        System.out.println("Informacion del gerente: ");
        System.out.println("");
        gerente.mostrarInformacion();
    }
}
