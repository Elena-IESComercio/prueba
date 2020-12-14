/* Diseñar una funcion llamada Calculadora que reciba dos enteros y una operacion.
Dependiendo de la operacion, realizaremos la suma resta multiplicacion o division de los numeros introducidos */
package tema5;

public class Ejercicio17 {
    public static void main(String[] args) {
        int n1, n2;
        double resultado=0;
        String caracter;
        
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce un Nº entero: ")) ;
        n2 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce un Nº entero: ")) ;
        caracter = misfunciones.IntroducirDatos.pedirDato("Introduce + o - o * o /", "[+-*/]");
        
        switch (caracter){
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            case "*":
            resultado = n1 * n2;
            }
        System.out.println(resultado);
    } 
}
