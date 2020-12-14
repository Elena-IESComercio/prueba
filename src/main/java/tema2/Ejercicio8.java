/*  Diseñar una aplicación que calcule la longitud y el área
de una circunferencia. Para ello, el usuario introducirá por teclado
el radio de dicha circunferencia.
 */
package tema2;

import java.util.Scanner;


public class Ejercicio8 {
    public static final float PI = 3.14f;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float radio, area, longitud;
        
        // Primero pediremos el radio al usuario.
        
        System.out.print("Introduce el radio de la circunferencia: ");
        radio = sc.nextFloat();
        
        // Seguido calcularemos cuanto es el area y la longitud
        
        area = (float) (PI*(Math.pow(radio,2)));
        longitud = 2 * PI * radio;
        
        // Por ultimo mostraremos por pantalla los resultados
        
        System.out.println("El area de la circunferencia es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        
    }
        
        
        
      
}
    