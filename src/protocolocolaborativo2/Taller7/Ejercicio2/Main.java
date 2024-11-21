/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller7.Ejercicio2;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("91220629916", 305342.2, "Ahorros");

        System.out.println("Ejercicio 3");
        System.out.println("");
        
        // System.out.println(cuenta.numeroCuenta);
        System.out.println(cuenta.tipoCuenta);

        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.setSaldo(350823.43);
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());

        cuenta.mostrarDetalles();
    }
}
