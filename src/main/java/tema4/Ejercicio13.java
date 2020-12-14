/* Realiza un programa en JAVA que muestre cuantos años bisiestos hay entre dos Nº
introducidos por el usuario*/
package tema4;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año1, año2,añosBisiestos=0;
        byte algoritmo1, algoritmo2, algoritmo3;
        
        
        // Entrada de datos
        do{
            System.out.print("Introduzca dos Nº separados por un espacio: ");
            año1 = Integer.parseInt(sc.next());
            año2 = Integer.parseInt(sc.next());
        }while(año1<0 || año2<año1);
        
        for(;año2>=año1;año2--){
            algoritmo1 = (byte) (año2%4);
            algoritmo2 = (byte) (año2%100);
            algoritmo3 = (byte) (año2%400);
            if (algoritmo3==0){
                añosBisiestos++;
            }else if (algoritmo1==0 && algoritmo2!=0){
                añosBisiestos++;
            } 
        }
        System.out.print("Los años bisiestos entre estos numeros son: "+añosBisiestos);
    }
    
}
