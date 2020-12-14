/* 
 */
package tema5;

public class Ejercicio22 {
    public static void main(String[] args) {
        long n1, resultadoTotal=0, resultado = 0, b, c;
        
        n1 = Long.parseLong(misfunciones.IntroducirDatos.pedirDato("Introduce 1 Nº", "[1-9]+"));
        
        for(int cont=0;n1>cont;cont++){ // Damos vueltas al numero para sacar el factorial
            c = n1-cont;
            b=1;
            resultado=c;
            for(;c>b;b++){ //Aqui calculamos el factorial del numero
                resultado = resultado*b;
            }
            System.out.println("El factorial de "+c+" es: "+resultado);
            resultadoTotal=resultadoTotal+resultado;
        }
        System.out.println("La suma de todos los factoriales es: "+resultadoTotal);
        
    }
    
}
