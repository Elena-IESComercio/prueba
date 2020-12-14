/*Generar un programa que muestre un numero del 1 al 3 y segun lo que salga un lenguaje asignado
acontinuacion generara un numero entre 2 y doce, otro entre 6 y 16 y otro entre 1 y 10*/
package tema3;

import java.util.Scanner;

public class Ejercicioextra {
    public static void main(String[] args) {
        //Variables y pedir el digito
        Scanner sc = new Scanner (System.in);
        byte lenguaje, ejercicio1, ejercicio2, ejercicio3;
        System.out.print("Pulsa enter y veremos que te ha tocado ");
        lenguaje = (byte)(Math.random()*4);
        ejercicio1 =  (byte)(Math.random()*(12-2)+2);
        ejercicio2 =  (byte)(Math.random()*(16-6)+6);
        ejercicio3 =  (byte)(Math.random()*11+1);
        
        System.out.print("Tu lenguaje de programacion es: ");
        switch (lenguaje){
            case 0:
                System.out.println("C");
                break;
            case 1:
                System.out.println("Pythom");
                break;
            case 2:
                System.out.println("Pascal");
                break;
            case 3:
                System.out.println("JavaScript");
                break;
            default:
                System.out.println("Algo esta mal");
        }
        System.out.println("Ejercicio1 Nº: "+ ejercicio1);
        System.out.println("Ejercicio2 Nº: "+ ejercicio2);
        System.out.println("Ejercicio3 Nº: "+ ejercicio3);
        
    }
    
}
