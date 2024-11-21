/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller6.Ejercicio3;

/**
 *
 * @author juana
 */
public class Banco {
    
    protected double saldo;
    
     public Banco(double saldoInicial) {
        this.saldo = saldoInicial; }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo); }
}
