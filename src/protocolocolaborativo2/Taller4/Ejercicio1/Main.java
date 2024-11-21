/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller4.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
     public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Juan Alzate", 18, 3);
        
        System.out.println("Ejercicio 1");
        System.out.println("");
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Edad del estudiante: " + estudiante.getEdad());
        System.out.println("Nota promedio del estudiante: " + estudiante.getNotaPromedio());
        System.out.println("");

        estudiante.setNombre("Carlos Galvis");
        estudiante.setEdad(25);
        estudiante.setNotaPromedio(4);
        
        System.out.println("Nombre actualizado del estudiante: " + estudiante.getNombre());
        System.out.println("Edad actualizada del estudiante: " + estudiante.getEdad());
        System.out.println("Nota promedio actualizada del estudiante: " + estudiante.getNotaPromedio());
    }
}
