/*Realizar un programa en JAVA que reciba un Nº entero positivo y muestre los Nºs
descendentes de  uno en uno */
package tema5;

public class Ejercicio13 {
    public static void main(String[] args) {
        int n1;
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce 1 Nº"));
        numero(n1);
        
        
    }
    
    public static void numero(int a) {
        
        if (a==1){
            System.out.println("1");
        }
        else{
            System.out.println(a);
            numero(a-1);
        }
        
    }
}
