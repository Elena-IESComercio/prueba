/*Escribir un programa para aprender a contar de forma que se pedirá al usuario un número N y
se debe mostrar por pantalla los números del 1 a N.*/
package tema4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte numero=1, valor1, valor2;
        
        //Pedimos al usuario un Nº del 1 al 99
        System.out.print("Buenas indique un Nº del 1 al 99: ");
        valor1 = sc.nextByte();
        
        //Realizamos los bucles
        while (numero<=valor1){
            System.out.println("Nº: "+numero);
            numero++;
        }
        System.out.print("Buenas indique otro Nº del 1 al 99: ");
        valor2= sc.nextByte();
        numero=0;
        do{
            System.out.println("Nº: "+numero);
            numero++;
        }
        while (numero<=valor2);
    }
    
}
