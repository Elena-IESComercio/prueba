/*Realiza un programa en Java que muestre los numeros del 0 al 9 *
 */
package tema4;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Introducimos las variables
        byte valor1, valor2;
        
        //Pedimos los datos al cliente
        valor1=0;
        valor2=0;
        
        //Añadimos los bucles
        while (valor1<=9){
            System.out.println("El Nº es: "+valor1);
            valor1++;     
        }
        do{
            System.out.println("El Nº es: "+valor2);
            valor2++;
        }
        while (valor2<=9);
            
    }
    
}
