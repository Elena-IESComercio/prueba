/*Realiza un programa en JAVA que pida dos numeros enteros al usuario (n1, n2) y
calcule y muestre por pantalla el resultado de n1 multiplicado por n2 mediante sumas.
 */
package tema4;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n1, n2, i, resultado=0;
        
        System.out.print("Introduce Nº: ");
        n1 = sc.nextShort();
        System.out.print("Introduce el Nº por el que deseas multiplicar el anterior: ");
        n2 = sc.nextShort();
        
        for (i=0;i<n2;i++){
            resultado= (short) (resultado+n1);
        }
        System.out.println("El resultado es: "+resultado);
    }
}
