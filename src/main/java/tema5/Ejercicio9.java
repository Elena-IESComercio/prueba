/*Realizar un programa en JAVA que pida un Nº entero entro -9999 y 9999 
y otro que sea entero positivo incluido el 0 y que este entre 0 y 99 y muestre por pantalla el resultado de x elevado a y */
package tema5;

public class Ejercicio9 {
    public static void main(String[] args) {
        int n1, n2;
        double resultado;
        
        do{
            n1 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce un Nº entre -9999 y 9999: "));
        }while (n1<-9999 || n1>9999);
        
        do{
            n2 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce un Nº de 0 a 99"));
        }while (n2<0 && n2>99);
        
        resultado =Math.pow(n1, n2);
        
        System.out.println("El total de "+n1+" elevado a "+n2+" es: "+resultado);  
    }
}
