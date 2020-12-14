/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int codigo, litros=0, facturaAlta, factura=1;
        double precio=0, resultado=0, total;
        
        for (;factura<6;factura++){
            System.out.println("Factura Nº: "+factura);
            do{
                System.out.print("Introduce el codigo del articulo:");
                codigo = sc.nextByte();
                System.out.print("Introduce la cantidad de litros vendida: "+litros);
                litros = sc.nextInt();
                System.out.print("Introduce el precio por litro: "+precio);
                precio = sc.nextDouble();
                resultado = resultado * litros;
                
            }while (litros==resultado);
            
        }
    }
    
}
