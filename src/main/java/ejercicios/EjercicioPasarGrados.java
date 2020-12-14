/*Programa Java que lee una temperatura expresada en grados centígrados y
la convierte a grados kelvin.*/
package ejercicios;

import java.util.Scanner;

public class EjercicioPasarGrados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temperatura;
        char car;
        String caracter;
        do{
            System.out.print("Introduce temperatura en ºC: ");
            temperatura = sc.nextDouble();
            System.out.println("Grados Kelvin : " + (temperatura+273));
            System.out.print("Repetir proceso? (S/N): " );
            caracter = sc.next();
            car = caracter.charAt(0);
        }while(car =='S' || car == 's');
    }
    
}
