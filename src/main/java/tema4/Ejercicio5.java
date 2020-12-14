/*Programa que muestre para un Nº escrito por teclado si es par positivo y su cuadrado.
y el proceso se repetira hasta que el usuario introduzca un 0*/
package tema4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        short numero;
        //Bucles
        do{
            System.out.print("Introduce un Nº: ");
            numero = sc.nextShort();
            if (numero%2==0){
                System.out.println("Nº PAR");
            }
            if (numero>0){
                System.out.println("Nº POSITIVO");
            }
            System.out.println("El cuadrado del Nº es: "+numero*numero);
        }while (numero!=0);
        System.out.println("Al poner 0 se termina el programa.");  
    }
    
}
