/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller6.Ejercicio3;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        Banco banco = new Banco(1000);
        System.out.println("Ejercicio 3");
        System.out.println("\nDe forma no segura");
        System.out.println("");
        System.out.println(banco.saldo);
        banco.saldo = -500;
        banco.mostrarSaldo();
    }
}
