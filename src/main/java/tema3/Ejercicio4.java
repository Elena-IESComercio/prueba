/*Realizar un programa que pida un numero real e indique si ese numero
es un numero casi 0 (Es aquel positivo o negativo que se acercan a cero
por menos de 1 unidad)
 */
package tema3;

import java.util.Scanner;

 class Ejercicio4 {
     public static void main(String[] args) {
         
         //Introducimos las variables
        Scanner sc = new Scanner (System.in);
        float x;
           
         System.out.print("Introduce un Nº real: ");
         x = sc.nextFloat();
         
         
        //Introducimos las bifurcaciones
        
        if (!(x==0) && (x>-1) && (x<1)){
            System.out.println("El numero es casi 0");
        }
        else {
            System.out.println("No es casi 0");
        }       
    }
}
