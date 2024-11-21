/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller5.Ejercicio3;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan", 10);

        System.out.println("Ejercicio 3");
        System.out.println("");
        System.out.println("Nombre: " + persona.getNombre());
        persona.setNombre("Juan Alzate"); 
        persona.mostrarInfo();

        System.out.println("Edad: " + persona.edad);
    }
}
