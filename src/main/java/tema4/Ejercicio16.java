/*Dadas 10 notas correspondientes a 10 alumnos escribir la cantidad de alumnos aprobados,
suspendidos o condicionados (nota 4,9). */
package tema4;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte alumno=1,contAprobados=0, contSuspendidos=0, contCondicionados=0;
        float nota;
        
        System.out.println("Vaya introduciendo las notas de los alumnos.");
        do{
            do{
                System.out.print("La nota del alumno ("+alumno+") es:");
                nota=sc.nextFloat();
            }while(nota<0 || nota>10);
        alumno++;
            if (nota<4.9){
                contSuspendidos++;
            }else if (nota>=5){
                contAprobados++;
            }
            else{
                contCondicionados++;
            }

        }while(alumno<11);
        System.out.println("El Nº de alumnos aprobados es: "+contAprobados);
        System.out.println("El Nº de alumnos suspendidos es: "+contSuspendidos);
         System.out.println("El Nº de alumnos condicionados es: "+contCondicionados);
        
            
        
        
    }
    
}
