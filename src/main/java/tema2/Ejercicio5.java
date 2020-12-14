/*
 Necesitamos una aplicación que calcule la media aritmética
de dos notas enteras. Hay que tener en cuenta que la media
puede contener decimales.
 */
package tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        byte nota_primera;
        byte nota_segunda;
        
        System.out.print("La primera nota es ");
        nota_primera = s.nextByte();
        System.out.print("La segunda nota es ");
        nota_segunda = s.nextByte();
        
        float nota_final = ((nota_primera + nota_segunda)/2F);
        
        s.nextLine();
        System.out.println("La nota media es " + nota_final);
        }
        
        
                
        
        
       
        
        
        
        
        
        
    }
    
