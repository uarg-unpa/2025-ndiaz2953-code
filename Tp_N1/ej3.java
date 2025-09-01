package Tp_N1;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*Ingresar un día de la semana y si se trata de uno de los días de la cátedra resolución escribir “HOY TENGO
        RESOLUCION”. Identificando a los días de la siguiente manera: ‘L’ para Lunes, ‘M’ para Martes, ‘I’ para
        Miércoles, ‘J’ para Jueves, ‘V’ para Viernes, ‘S’ para Sábado y ‘D’ para Domingo. Se puede agregar el caso
        dónde la letra ingresada no sea alguna de las nombradas anteriormente.*/

        
        String dia;

        System.out.println("Ingresar un dia de la semana (L, M, I, J, V, S o D)");
        
        dia = scanner.next();

        switch (dia) {
            case "L":
                System.out.println("no hay");        
                break;
            case "M":
                System.out.println("hay");      
                break;
            case "I":
                System.out.println("hay");
                break;
            case "J":
                System.out.println("hay");
                break;
            case "V":
                System.out.println("no hay");
                break;
            case "S":
                System.out.println("no hay");
                break;
            case "D":
                System.out.println("no hay");
                break;            
            default:
                System.out.println("No coincide con las opciones");      
                break;
        }


        scanner.close();
    }
}
