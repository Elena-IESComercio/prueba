/*Modifica el ejercicio para que el número introducido por pantalla esté acotado entre 1 y 10.
Dependiendo el número que introduzca el usuario mostraremos todas las tablas de multiplicar
desde el número introducido por el usuario hasta la tabla de 10 inclusive.
 */
package tema4;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte numero, multiplo;
        
        //Bucles
        do{
            System.out.print("Indique un Nº y se te mostrara la tabla de multiplicar de ese Nº: ");
            numero = sc.nextByte();
        }while (numero<0 || numero>11);
        
        for (;numero<11;numero++){ 
            System.out.println("");
            System.out.println("Tabla del: "+numero);
            for (multiplo = 1; multiplo<11; multiplo++){
                System.out.println(numero+"x"+multiplo+"="+(numero*multiplo));
            }   
        }
    }
}
