package ParImpar;
import java.util.Scanner;
/**
 *
 * @author Jordi Grau Ferrando
 */
public class ParImpar {
    
    public static void ParoImpar(int NUMERO){
    if (NUMERO % 2 == 0){ //Devuelve true si el resto de dividir entre 2 es 0.
            System.out.println("Es un número par.Los números pares anteriores son: ");
            for(int i = NUMERO; i>=0; i-=2){
                System.out.print(i + " ");
            }
        }
        else {
            System.out.println("Es un número impar.Los números impares anteriores son: ");
            for(int i = NUMERO; i>=1; i-=2){
                System.out.print(i + " ");
            }
        }
    }
    public static void main (String [] args){
        int NUMERO;
        
        //Si es con Scanner
        /*
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Escribe el número: ");
        NUMERO = kb.nextInt();
        */
        
        //Metodo pre establecido LEER
        NUMERO = LEERNUMERO();
        
        //Ejecucion
        ParoImpar(NUMERO);
        
    }
}

