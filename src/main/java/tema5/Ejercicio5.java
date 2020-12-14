/* Modifica el Ejercicio3 para que la funcion reciba 3 Nº y devuelva el maximo de los 3 */
package tema5;

import misfunciones.IntroducirDatos;
import misfunciones.Matematicas;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n1, n2, n3, resultado;
        
        n1 = IntroducirDatos.pedirNumero("Introduce el primer Nº:");
        n2 = IntroducirDatos.pedirNumero("Introduce el segundo Nº:");
        n3 = IntroducirDatos.pedirNumero("Introduce el tercer Nº:");
        
        resultado = Matematicas.maximo(n1, n2, n3);
        System.out.println("El Nº mas alto es: "+ resultado);
        
    }
    
}
