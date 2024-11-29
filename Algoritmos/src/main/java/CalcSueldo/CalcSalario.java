package CalcSueldo;
import java.util.Scanner;
/**
 *
 * @author Jordi Grau Ferrando
 */
public class CalcSalario {
    
    public static double calculaSalario(double tarifa, int horas_trabajadas) {
        double sueldo = Math.min(40,horas_trabajadas)*tarifa;
            if (horas_trabajadas > 40){
                sueldo += (horas_trabajadas - 40)*(tarifa*1.5);
            }
        return sueldo;
    }
    
    public static void main(String [] args){
        double sueldo;
        double tarifa;
        int horas_trabajadas;
        
        //Si es con escaner se usan estas lineas descomentandolas
        /* 
        Scanner kb = new Scanner(System.in);
        System.out.print("Tarifa: ");
        tarifa = kb.nextDouble();
        System.out.print("Horas trabajadas: ");
        horas_trabajadas = kb.nextInt();
        */
        
        //Si es con los métodos pre establecidos de LEER
        tarifa = LEERTARIFA();
        horas_trabajadas = LEERHORASTRABAJADAS();
        
        sueldo = calculaSalario(tarifa, horas_trabajadas);
        System.out.println("Sueldo: " + sueldo);
    }
}
