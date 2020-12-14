/*Pide al usuario un Nº impar y que imprima el simbolo del rombo con . */
package tema5;

public class Ejercicio25 {
    public static void main(String[] args) {
        int n1;
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.pedirDato("Introduce un Nº impar: ", "[13579]+"));
        rombo(n1);
    }
    
    public static void rombo(int num) {
        int a, b=1, c=0, d=0;
        a=num/2;
        
        for (int cont=0; num>cont;cont++){
            if(num/2>=cont){
                if(cont==0){
                    c=d=0;
                }
                else if(cont==1){
                    a=a-1;
                    c=1;
                    d=1;
                }else{
                    a=a-1;
                    c=c+2;
                }
            }else{
                if (cont==num-1){
                    a=num/2;
                    c=d=0;
                }else if (cont==num-2){
                    a=num/2-1;
                    c=d=1;
                    
                }else{
                    a=a+1;
                    c=c-2;
                }
            }
                        
            misfunciones.IntroducirDatos.imprimeEspacio(a);
            misfunciones.IntroducirDatos.imprimePunto(b);
            misfunciones.IntroducirDatos.imprimeEspacio(c);
            misfunciones.IntroducirDatos.imprimePunto(d);
            System.out.println("");    
        }
    }
    
}
