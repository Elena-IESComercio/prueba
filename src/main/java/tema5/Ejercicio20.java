/*Realizar un programa que tenga una función que muestre cuál es el más grande de entre los
números enteros positivo + 0, introducidos por teclado. Los números se entregan al programa
todos en una línea y la entrada de datos termina cuando el usuario introduce -1. */
package tema5;

import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int alto=0, n1;
        
        System.out.print("Introduce Nº separados por espacios y cuando pongas -1 te dire cual es el Nº mas grande que pusiste:");
        do{
            n1 = Integer.parseInt(sc.next());
            if(n1>alto){
                alto = n1;
            }
        }while (n1!=-1);
        System.out.println("El Nº mayor es: "+alto);
    }
    
}
