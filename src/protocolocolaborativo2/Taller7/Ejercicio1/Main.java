/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller7.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Humberto morales", 5000000);

        System.out.println("Ejercicio 1");
        System.out.println("");
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Salario: " + empleado1.getSalario());

        empleado1.setSalario(7500000);
        System.out.println("Salario con aumento: " + empleado1.getSalario());
    }
}
