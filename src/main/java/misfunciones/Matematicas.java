
package misfunciones;

import java.util.Scanner;

public class Matematicas {
    
    public static int maximo (int a, int b, int c){
        if (a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        } else {
            return c;
        }  
    }
    
    public static void primo (String a) {
        int numero, cont=0, i;
        numero = Integer.parseInt(a);
        for (i=1;i<=numero;i++){
            if (numero%i==0){
                cont++;
            }
        }
        if (cont==2){
            System.out.println("Es Primo");
        }
        else{
            System.out.println("No es primo");
        }        
    }
    
    public static boolean esDivisor (int a, int b) {
        if (a%b==0){
            return true;
        }        
        else{
            return false;
        }
    }
    
    public static long elevado (int base, int exponente) {
        int resultado=0, base1;
        byte cont1, cont2;
        
        base1=base;
        
        for(cont1=1;cont1<exponente;cont1++){
            resultado=0;
            for(cont2=0;cont2<base;cont2++){
                resultado = resultado+base1;
            }
            base1=resultado;
        }
        return resultado;
    }
    
    public static void muestraDivisor (int numero) {
        int i=1;
        do{
            if(numero%i==0){
                System.out.println(i);
            }
            i++;
        }while (i<numero);
    }
    
    public static int elevadoRecursivo (int a, int b){
        int resultado;
        if(b==0){
            resultado = 1;
        }
        else{
            resultado = a * elevadoRecursivo(a, b-1);
        }
        return resultado;
    }
    
    public static int fivonnaci(int n) {
        int resultado;
        switch (n){
            case 0:
                resultado = 0;
                break;
            case 1:
                resultado = 1;
                break;
            default:
                resultado = fivonnaci(n-1)+fivonnaci(n-2);
                
        }
        return resultado;
        
    }
    
    public static long factorial(int a) {
        long resultado=a, b;
        b=1;
        for(;a>b;b++){
            resultado = resultado*b; 
        }
        System.out.print("Factorial de "+a+" es: " );
        return resultado;
        
    }
    public static int sumaRecursivo(int a, int b) {                                                                            
        if (b == 0) {
            return a;
        } else if (a == 0) {
                   return b;
        } else {
              return 1 + sumaRecursivo(a, b - 1);                                                                              
        }
    }
    
    public static int restoRecursivo(int a, int b) {                                                              
          if (a < b) {
               return a;
          } else {
                return restoRecursivo(a - b, b);
          }
    }
    
    public static int numeroCifras(int n){
           if(n < 10)  //caso base
              return 1;
           else
              return 1 + numeroCifras(n/10);
    }
        
    
}
