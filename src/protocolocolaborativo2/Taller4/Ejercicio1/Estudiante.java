/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller4.Ejercicio1;

/**
 *
 * @author juana
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    public Estudiante(String nombre, int edad, double notaPromedio){
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre; }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad; }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else
            System.out.println("La edad no puede ser negativa.");
    }

    public double getNotaPromedio() {
        return notaPromedio; }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        } else
            System.out.println("La nota promedio debe estar entre 0 y 5.");
    }
}
