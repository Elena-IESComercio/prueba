/*Realiza un programa en JAVA que pida al usuario un numero entero calcule
y muestre por pantalla si el numero es par o impar. */
package tema3;

import java.util.Scanner;

public class Ejercicio1 {
    //Pediremos la variable
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        short x;
        
        //Pondremos las condiciones
        System.out.print("Por favor indique un numero entero: ");
        x = sc.nextShort();
        
        if (x%2 == 0){
            System.out.println("El numero es PAR");
        }
        else{
            System.out.println("El numero es IMPAR");
        }
        
        
        
                
        
    }
    
}
