
package tema5;

public class Ejercicio18 {
    public static void main(String[] args) {
        fibonaci(10);
    }
    public static int fibonaci(int a) {
        int b=a, resultado;
        if(a==0){
            resultado = 0;
            System.out.println(resultado); 
        }
        else if(a==1){
            resultado = 1;
        }
        else{
            resultado = fibonaci(a-1)+fibonaci(a-2);
            System.out.println(resultado);
        }
        return resultado;
        
        
    }
    
}
