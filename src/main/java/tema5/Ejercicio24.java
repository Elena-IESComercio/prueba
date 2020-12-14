/*Diseñar una función recursiva que dado un número N entero positivo, calcula y devuelve el
número binario correspondiente a dicho número recibido (mediante divisiones por 2). */
package tema5;

public class Ejercicio24 {
    public static void main(String[] args) {
        int n1;
        n1= Integer.parseInt(misfunciones.IntroducirDatos.pedirDato("Introduce 1 Nº:", "\\d+"));
        binario(n1);
        
    }
    public static void binario (int a) {
        int binario;
        if (a==0){
            System.out.print("0");
        }else if (a==1){
            System.out.print("1");
        }else{
            binario = (a%2);
            binario(a/2);
            System.out.print(binario);
        }
        
    }
    
}
