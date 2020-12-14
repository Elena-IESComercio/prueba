/*Haz un PARALELOGRAMO con n numeros */
package tema4;

public class Ejercicio19 {
    public static void main(String[] args) {
        int n1;
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce 1 Nº"));
        dibujaParalelogramo(5);
        
    }

    public static void dibujaParalelogramo(int n1) {
        int a, b ,c, d;
        for(int i=0;i<n1;i++){
            if (i==0){
                a = n1-1;
                b = n1;
                c=d=0;
            }
            else if(i==n1){
                a=c=d=0;
                b = n1;
            }else{
                n1=n1-i;
                a=n1-1;
                b=1;
                c=n1-1;
                d=1;
            }
            System.out.println(a+" "+b+" "+c+" "+d);
            ponEspacio(a);
            ponPunto(b);
            ponEspacio(c);
            ponPunto(d);
            System.out.println("");
        }
    }
    public static void ponEspacio(int n) {
        for (int i=0;i==n;i++){
            System.out.print(" ");
        }  
    }
    public static void ponPunto(int n) {
        for (int i=0;i==n;i++){
            System.out.print(".");
        }  
    }
    
}
