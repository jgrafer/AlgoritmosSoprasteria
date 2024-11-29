package Clasificación;
import java.util.Scanner;
/**
 *
 * @author Jordi Grau Ferrando
 */
class Persona {
    int EDAD;
    String SEXO; //Masculino o Femenino
    
    public Persona(int EDAD, String SEXO){
        this.EDAD = EDAD;
        this.SEXO = SEXO;
    }
}

public class ClasificaciónPersonas {
    public static void Clasificar(Persona [] PERSONAS){
        
        int mas18 = 0; // Mayores de edad.
        int menos18 = 0; // Menores de edad.
        int masc18 = 0; // Personas masculinas mayores de edad.
        int fem18 = 0; // Personas femeninas menos de edad.
        double percMas18 = 0; // Porcentaje mayores de edad sobre el total.
        int femTotal = 0; // Total mujeres.
        double percFemTotal = 0; // Porcentaje de mujeres respecto al total.
        
        //Sacar datos
        for(Persona persona:PERSONAS){
            if (persona.EDAD>=18){
                mas18++;
                if(persona.SEXO.equals("Masculino")){
                    masc18++;
                }
            }
            else {
                menos18++;
                if(persona.SEXO.equals("Femenino")){
                    fem18++;
                    }
                }
                if (persona.SEXO.equals("Femenino")){
                    femTotal++;
                }
        }
        
        //Sacar porcentajes
        percMas18 = ((double)mas18/PERSONAS.length)*100; //Al ser un valor fijo podriamos utilizar 50 en vez del length.
        percFemTotal = ((double)femTotal/PERSONAS.length)*100;
        
        //Mostrar resultados
        System.out.println("Resultados: ");
        System.out.println("Personas mayores de edad: " + mas18);
        System.out.println("Personas menores de edad: " + menos18);
        System.out.println("Personas masculinas mayores de edad: " + masc18);
        System.out.println("Personas femeninas menores de edad: " + fem18);
        System.out.println("Porcentaje de mayores de edad: " + percMas18);
        System.out.println("Porcentaje de mujeres: " + percFemTotal);
    }
    public static void main(String [] args) {
        
        Persona [] PERSONAS = new Persona[50];
        //Con Scanner
        /*
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i<PERSONAS.length; i++){
            
            System.out.print("Edad: ");
            int edad = kb.nextInt();
            System.out.println("Sexo: ");
            String sexo = kb.next().trim();
            
            PERSONAS[i] = new Persona(edad, sexo);
        }
        */
        PERSONAS = LEERPERSONAS();
        
        Clasificar(PERSONAS);
    }
}
