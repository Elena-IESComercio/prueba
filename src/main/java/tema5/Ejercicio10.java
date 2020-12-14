/*Realizar una funcion que pida un entero y calcule todos los divisiores de ese Nº.
Reutilizar funciones anteriores.*/
package tema5;

public class Ejercicio10 {
    public static void main(String[] args) {
        int n1;
        
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce un Nº: "));
        misfunciones.Matematicas.muestraDivisor(n1);
    }
    
}
