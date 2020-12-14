/*Realizar el juego de “número secreto”. El ordenador generará un número aleatorio entre
[1,100], y pedirá al usuario que lo adivine. El ordenador debe dar al usuario pistas del tipo
“mayor” o “menor” por pantalla. El proceso termina cuando el usuario acierta o se rinde
(introduce un número negativo).*/
package tema4;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numAleatorio, numUsuario=1;
        numAleatorio = (byte)(Math.random()*100+1);
        
        System.out.println("Buenas ¡Intenta adivinar en el numero que estoy pensando!");
        System.out.print("Introduce un Nº entre 1 y 100: ");
        
        while(numUsuario>0){
           numUsuario = sc.nextByte();
           if (numUsuario<numAleatorio){
               System.out.println("MAYOR");
           }else if (numUsuario>numAleatorio){
               System.out.println("MENOR");
           }else if (numUsuario==numAleatorio){
               System.out.println("¡¡¡DE LOCOS!!! ACERTASTE");
           }
        }
    }
}
