/*Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación
solicitará por teclado un número; si ese número está fuera del rango se volverá a solicitar otro
número, así constantemente mientras el usuario se equivoque. El programa acaba cuando el
usuario introduce un valor correcto.
 */
package tema4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte valorMin, valorMax, valor;
        
        //Pedimos rango
        System.out.println("Buenas introduzca el valor maximo y el valor min.");
        System.out.print("Valor MAXIMO: ");
        valorMax = sc.nextByte();
        sc.nextLine();
        System.out.print("Valor MINIMO: ");
        valorMin = sc.nextByte();
        sc.nextLine();
        System.out.print("Introduzca un Nº entre esos valores:");
        valor = sc.nextByte();
        //Bucles
        while (valor<valorMin || valor>valorMax){
            System.out.print("Introduzca un Nº entre esos valores:");
            valor = sc.nextByte();
        }
        do {
            System.out.print("Introduzca otro Nº entre esos valores:");
            valor = sc.nextByte();
        } while (valor<valorMin || valor>valorMax);
        System.out.println("Programa Finalizado.");
        
        
    }
    
}
