/*Realizar un programa en Java que solicite al usuario dos numeros enteros
e indique si son o no iguales*/
package tema3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        short x, y;
        
        //Pondremos las condiciones
        System.out.println("Por favor indique dos numeros enteros: ");
        x = sc.nextShort();
        y = sc.nextShort();
        
        if (x == y){
            System.out.println("Los numeros son Iguales");
        }
        else{
            System.out.println("Los numeros no son iguales");
        }
    }
    
}
