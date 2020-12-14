/*Realiza un programa en JAVA que pida dos Nº enteros por pantalla y 
muestre el mas grande ( hay que utilizar el operador ternario)
 */
package tema3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte x, y, valor1;
                
        System.out.println("EScribe dos Numeros enteros: ");
        System.out.print("1º: ");
        x = sc.nextByte();
        System.out.print("2º: ");
        y = sc.nextByte();
        
        
        valor1 = x>y? x : y;
        
        System.out.println("El valor mas grande es: "+ valor1);
        
        
    }
    
}
