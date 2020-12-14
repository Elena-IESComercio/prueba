/* Realizar una funcion que reciba dos Nº enteros y devuelva con es el maximo de los 2 */
package tema5;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x1, x2;
        
        System.out.println("Introduce 1º Nº: ");
        x1 = sc.nextInt();
        System.out.println("Introduce el 2º Nº: ");
        x2 = sc.nextInt();
        System.out.println("El Nº mayor es: "+maximo(x1,x2));
    }
    
    // Función
    public static int maximo(int a, int b){
        if (a<b){
            return b;
        }
        else{
            return a;
        } 
    }
    
}
