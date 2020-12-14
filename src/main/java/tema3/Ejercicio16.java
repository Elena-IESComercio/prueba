/*Realizar un programa que solicite al usuario un número entre 1 y 99. El programa debe
mostrarlo en texto por pantalla. (con switch). */
package tema3;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte decena, unidad, aux;
        // Pediremos el numero al usuario
        System.out.print("Por favor indique un Nº del 1-99: ");
        aux = sc.nextByte();
        
        decena = (byte) (aux/10);
        unidad = (byte) (aux%10);
        
        
                 
        
                
    }
    
}