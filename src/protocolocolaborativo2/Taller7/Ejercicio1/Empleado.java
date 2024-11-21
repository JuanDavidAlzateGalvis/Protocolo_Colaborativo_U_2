/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller7.Ejercicio1;

/**
 *
 * @author juana
 */
public class Empleado {
    
    public String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario; }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo.");
        }
        this.salario = salario; }
}
