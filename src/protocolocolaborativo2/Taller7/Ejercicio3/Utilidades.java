/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo2.Taller7.Ejercicio3;

/**
 *
 * @author juana
 */
public class Utilidades {
    
    public static int sumar(int a, int b) {
        return a + b; }
    
    public static int restar(int a, int b) {
        return a - b; }
    
    public static int multiplicar(int a, int b) {
        return a * b; }
    
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error, no se puede dividir entre 0.");
        }
        return a / b; }
}
