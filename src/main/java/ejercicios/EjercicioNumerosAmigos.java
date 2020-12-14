
package ejercicios;

public class EjercicioNumerosAmigos {
    
    public static void main(String[] args) {
        int n1, n2;
        long suma1, suma2;
        
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.pedirDato("Introduce un Nº: ", "\\d+"));
        n2 = Integer.parseInt(misfunciones.IntroducirDatos.pedirDato("Introduce otro Nº: ", "\\d+"));
        
        suma1 = sumaDivisores(n1);
        suma2 = sumaDivisores(n2);
        
        if (n1 == suma2 && n2 == suma1){
            System.out.println("Son amigos");
        }else{
            System.out.println("No son amigos");
        }
        
    }
    public static int sumaDivisores(int num) {
        int suma=0;
        for(byte i=1; i<num ; i++){
            if(num%i==0){
                suma= suma+i;
            }
        }
        return suma;
        
    }
    
}
