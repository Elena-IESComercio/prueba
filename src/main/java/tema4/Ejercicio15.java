/*Realiza un programa en JAVA que pida un Nº al usuario N y dibuje un triangulo
de n asteriscos*/
package tema4;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte numAsteriscos, numDerecha, numAbajo,cont=0;
        
        
        System.out.print("Buenas introduce un Nº: ");
        numAsteriscos = sc.nextByte();
        numDerecha=numAsteriscos;
        numAbajo=numAsteriscos;
        
        for (;numAbajo>0;numAbajo--){
            cont++;
            numDerecha=(byte) (numAsteriscos-cont);
            for (;numDerecha>0;numDerecha--){
                System.out.print("*");
            }
            System.out.println("*");
        }  
    }
    
}
