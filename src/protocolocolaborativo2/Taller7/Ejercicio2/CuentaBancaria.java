/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller7.Ejercicio2;

/**
 *
 * @author juana
 */
public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo; }

    public void setSaldo(double saldo) {
        this.saldo = saldo; }
    
    public void mostrarDetalles() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
