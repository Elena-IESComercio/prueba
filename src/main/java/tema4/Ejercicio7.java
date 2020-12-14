 /*Realizar un programa que pida al usuario las calificaciones de 5 alumnos (comprobar entrada)
y decir si hay algún suspendo, indicando la cantidad, en el caso de que no hubiera ningún
suspenso mostraremos el mensaje “¡¡¡Qué gran trabajo el de este grupo!!!”.
 */
package tema4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte nota, alumnos=1, suspensos=0;
        boolean verdad;
        
        
        //Bucle
        while (alumnos<=5){
            do{
                System.out.print("Indique la nota del alumno "+alumnos+": ");
                nota = sc.nextByte();
                System.out.println("¿La nota del alumno "+alumnos+" es "+nota+"? true/false");
                verdad = sc.nextBoolean();
            }while (verdad==false);
            alumnos++;
            if (nota<5){
                suspensos++;
            }
        }
        System.out.println("Los suspensos son: "+suspensos);
        if (suspensos==0){
            System.out.println("Que gran trabajo de este grupo");
        }
    }
    
}
