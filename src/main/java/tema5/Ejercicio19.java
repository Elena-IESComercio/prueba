/* Fivonnacci N numeros */
package tema5;

public class Ejercicio19 {
    public static void main(String[] args) {
        int n1, n2;
        // Pedimos la cantidad de numeros que desea saber
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.pedirDato("Introduce un Nº:", "[0-9]+"));
        n2=n1;
        for(;n1>0;n1--){
            System.out.println("Fibonacci de "+n2+": "+misfunciones.Matematicas.fivonnaci(n2));
            n2--;
        }
    }
    
}
