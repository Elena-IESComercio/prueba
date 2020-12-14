/*Realiza un programa que solicite 2 numeros distintos y calcule y muestre cual
es mayor. En el caso que el usuario introdujera dos numeros iguales mostraremos
por pantalla el mensaje "Error"*/
package tema3;

import java.util.Scanner;

public class Ejercicio3 {
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        short x, y;
        
        //Pediremos los datos
        System.out.println("Por favor indique dos numeros enteros distintos: ");
        System.out.print("Primer Nº: ");
        x = sc.nextShort();
        System.out.print("Segundo Nº: ");
        y = sc.nextShort();
        
        //Pondremos las Condicionales
        if (x < y){
            System.out.println("El Nº "+y+" es el mayor");
        }
        else{
            if (x == y){
                System.out.println("ERROR, SON LOS MISMOS NUMEROS");
            }
            else{
                System.out.println("El Nº "+x+" es el mayor");
            }
        }
      }
}