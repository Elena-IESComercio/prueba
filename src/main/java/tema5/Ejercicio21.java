/*Realizar una función en Java que lea por teclado un número entero N no negativo y mostrar
el factorial de todos los números desde 0 hasta N, prohibido usar la recursividad en esta
función.  */
package tema5;

public class Ejercicio21 {
    public static void main(String[] args) {
        //Variables
        int n1, contador;
        
        //Pedimos datos
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.pedirDato("Introduce un Nº entero  y que no sea negativo:", "[0-9]+"));
        
        //Bucle
        for (;n1>0;n1--){
            System.out.println(misfunciones.Matematicas.factorial(n1));
        }
    }
    
}
