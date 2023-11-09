/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas.casting;


public class PruebasCasting {

   
    public static void main(String[] args) {
    double decimal = 5.5;
    int entero = (int) decimal; // Casting explícito de double a int
        System.out.println(entero);
        
        
        double prueba = 30.0; // Ejemplo de casting, cambiar un valor de una variable superior a una variable inferior, en este caso de double a entero. 
        int pruebaEntero = (int) prueba;
        System.out.println(pruebaEntero);
        
    
    }
    
}
