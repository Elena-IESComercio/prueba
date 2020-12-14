/* Realizar un programa en JAVA que pida al usuario su año de nacimiento
   y que calcule que edad tienes.
 */
package tema2;

import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        short año;
             
               
        System.out.print("Pon tu fecha de nacimiento y te dire cuantos años tienes: ");
        año = sc.nextShort();
        
        short edad = (short) (2020-año);
        System.out.println("Tu edad es " + edad);
        
               
    }
    
}
 