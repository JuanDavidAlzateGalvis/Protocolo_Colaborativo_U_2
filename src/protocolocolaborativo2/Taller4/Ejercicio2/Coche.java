/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller4.Ejercicio2;

/**
 *
 * @author juana
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double incremento) { 
        if (incremento > 0){
            this.velocidadMaxima += incremento;
        } else
            System.out.println("El incremento debe ser positivo.");
    }

    public String getMarca() {
        return marca; }

    public String getModelo() {
        return modelo; }

    public int getVelocidadMaxima() {
        return velocidadMaxima; }
}
