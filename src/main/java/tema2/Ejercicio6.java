/*
Modificar el ejercicio anterior para que muestre la parte
entera de la media de tres notas decimales.
 */

package tema2;

import java.util.Scanner;

public class Ejercicio6 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float nota_primera;
        float nota_segunda;
        float nota_tercera;
        
        System.out.print("La primera nota es ");
        nota_primera = s.nextFloat();
        System.out.print("La segunda nota es ");
        nota_segunda = s.nextFloat();
        System.out.print("La tercera nota es ");
        nota_tercera = s.nextFloat();
        
        byte nota_final = (byte)((nota_primera + nota_segunda + nota_tercera)/3);
        
        
        s.nextLine();
        System.out.println("La nota media es " + nota_final);
        }
        
        
}
