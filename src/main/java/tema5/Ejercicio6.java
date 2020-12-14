/*Crear una función que, mediante un booleano, indique si el carácter que se pasa como
parámetro de entrada corresponde a una vocal. */
package tema5;

import java.util.Scanner;
import misfunciones.IntroducirDatos;

public class Ejercicio6 {
    public static void main(String[] args) {
        char entrada;
        boolean resultado;
        
        entrada = IntroducirDatos.nextChar("Escribe 1 caracter: ");
        resultado = IntroducirDatos.esVocal(entrada);
        if (resultado) {
            System.out.println("Si es una vocal");
        } else
            System.out.println("No es una vocal");
    }
}
