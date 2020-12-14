
package misfunciones;

import java.util.Scanner;

public class IntroducirDatos {
    static Scanner sc = new Scanner (System.in);
    
    public static int pedirNumero(String msg){
        int a;
        
        System.out.println(msg);
        a = sc.nextInt();
        return a;
    }
    
    public static String dato (String msg){        
        String dato;
        
        System.out.println(msg);
        dato = sc.nextLine();
        return dato;
    }
    
    public static String pedirDato (String msg, String exp){        
        String dato;
        do{
            System.out.println(msg);
            dato = sc.nextLine();
        }while (!dato.matches(exp));
        return dato;
    }
    
    public static char nextChar (String msg){        
        String dato;
        
        System.out.println(msg);
        dato = sc.nextLine();        
        return dato.charAt(0);
    }

    public static boolean esVocal(char caracter) {        
        String expresion = "[AaEeIiOoUu].*";
        String aux;
        
        aux = caracter + "";
        return aux.matches(expresion);
    }
    public static void imprimePunto(int n) {
        for(int cont=0;n>cont;cont++){
            System.out.print(".");
        }
    }
    public static void imprimeEspacio(int n) {
        for(int cont=0;n>cont;cont++){
            System.out.print(" ");
        }
    }
}
/*
* ---*** Ejemplos expresiones regulares ***---
*
* A | B --> Debe ser A o B
* \d --> Dígitos (igual que [0-9] )
* \D --> No Digitos (igual que [^0-9] )
* \w --> Letra, dígito o _ (igual que [a-zA-Z0-9_] )
* \W --> Equivale a [^\w]
* {X} --> Lo que va antes de las llaves se repite X veces.
* {X,Y} --> Lo que va antes de las llaves se repite minimo X veces y máximo de Y veces.
* {X,} --> Lo que va antes de las llaves se repite mínimo X veces sin límite de máximo.
*
* * --> Equivale a {0,}
* + --> Equivale a {1,}
* ? --> Equivale a {0,1}
*
*
*/