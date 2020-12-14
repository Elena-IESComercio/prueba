/* Realizar una funcion que calcule el area y el volumen de 1 cilindro y devuelva*/
package tema5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float rad, alt;
        
        System.out.print("Introduce la altura: ");
        alt = sc.nextFloat();
        System.out.print("Introduce el radio: ");
        rad = sc.nextFloat();
        System.out.print("El area es: "+formulaArea(rad, alt));   
    }
    
    public static double formulaArea (double radio, double altura){
        double area;
        area = 2*Math.PI*radio*(altura+radio);
        return area;
    } 
}

