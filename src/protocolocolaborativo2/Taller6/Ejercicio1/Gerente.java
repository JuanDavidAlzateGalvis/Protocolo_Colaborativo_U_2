/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller6.Ejercicio1;

/**
 *
 * @author juana
 */
public class Gerente extends Empleado {

    private String departamento;
    
    public Gerente(String nombre, int salario, String departamento) {
       super(nombre, salario);
       this.departamento = departamento;
    }
    
    public void mostrarInformacion() {
        mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}