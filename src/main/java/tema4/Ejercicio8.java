/*Realiza un programa que un usuario ponga un numero y salga la tabla de
multiplicar de ese Nº*/
package tema4;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte numero, multiplo;
        
        System.out.print("Indique un Nº y se te mostrara la tabla de multiplicar de ese Nº: ");
        numero = sc.nextByte();
        
        //Bucle FOR
        for (multiplo = 1; multiplo<11; multiplo++){
            System.out.println(numero+"x"+multiplo+"="+(numero*multiplo));
        }        
    }
}
