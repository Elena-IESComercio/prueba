/*Idem al anterior pero se pedirá tres números (sin el operador ternario).
 */
package tema3;

import java.util.Scanner;

public class Ejercicio7 {
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
                
                
        if (x>y && x>f){
            if (y>f){
                valor1= x+","+y+","+f;
            }
            else{
                valor1= x+","+f+","+y;
            }
        }
        else if (y>x && y>f){
            if (x>f){
                valor1= y+","+x+","+f;
            }
            else{
                valor1= y+","+f+","+x;
            }
        }
        else if (f>x && f>y){
            if (y>x){
                valor1= f+","+y+","+x;
            }
            else {
                valor1= f+","+x+","+y;
            }
        }
        else{
            System.out.println("ERROR (Tienes algun numero Igual)");
        }
        
    }
        
    
}
