/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller7.Ejercicio3;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        int resultadoSuma = Utilidades.sumar(5, 5);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        int resultadoResta = Utilidades.restar(5, 3);
        System.out.println("Resultado de la resta: " + resultadoResta);

        int resultadoMultiplicacion = Utilidades.multiplicar(5, 5);
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);

        try {
        int resultadoDivision = Utilidades.dividir(25, 5);
        System.out.println("Resultado de la division: " + resultadoDivision);
        } catch (ArithmeticException excepcion) { 
            System.out.println("Error en la division: " + excepcion.getMessage());
        }
    }
}
