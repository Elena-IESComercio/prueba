/*Modifica el ejercicio 7 de tal modo que las condiciones no hagan uso
de los operadores lógicos &&, || y !. Es decir sólo uso operadores relacionales
 */
package tema3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte x, y, f;
        String valor1 = null;
        
        System.out.println("Escribe tres Numeros enteros: ");
        System.out.print("1º: ");
        x = sc.nextByte();
        System.out.print("2º: ");
        y = sc.nextByte();
        System.out.print("3º: ");
        f = sc.nextByte();
        
        if(x>y){
            if (y>f){
                valor1= x+","+y+","+f;
            }
            else if (f>x){
                valor1= f+","+x+","+y;
            }
            else{
                valor1= x+","+f+","+y;
            }            
        }
        else{
            if (f>y){
                valor1= f+","+y+","+x;
            } 
            else if (f>x){
                valor1= y+","+f+","+x;
            }
            else {
                valor1= y+","+x+","+f;
            }
        }
        
        System.out.println("En orden descendente es: "+valor1);    
    }
    
}
