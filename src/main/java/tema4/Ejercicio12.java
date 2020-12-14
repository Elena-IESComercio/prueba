/*Pedir un número al usuario y calcular cuál es el factorial del número introducido. Usaremos
break en caso de introducción de número negativo, además de mostrar mensaje de error.*/
package tema4;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x, r=1;
        
        System.out.print("Indica un Nº: ");
        x = sc.nextInt();        
        
        for(int i=0;i<x;i++){
            if(x<0){
                System.out.println("Error el Nº introducido no se puede calcular.");
                break;
            }
            r=r*x;
            x=x--;
        }
        if (x>-1) {
            System.out.println(r);    
        }
        
        
    }
    
}