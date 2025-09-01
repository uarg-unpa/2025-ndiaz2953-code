package Tp_N1;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
/* Dado tres números, escribir el mayor de ellos. Asumir que los tres números son distintos.
Entrada/s: 3 números (entero)
Salida/s: número mayor de los 3 ingresados (entero)
Diseño – PROCESO: Ingresar 3 números enteros. Comparar números buscando el mayor de los 3. Mostrar el mayor de los 3 números enteros

Algoritmo en pseudocodigo:

escribir “Ingrese 3 números enteros”
leer NRO1, NRO2, NRO3
    si (NRO1 > NRO2 & NRO1 > NRO3)
        escribir “El mayor es : ”, NRO1
    sino
        si (NRO2 > NRO1 & NRO2 > NRO3)
            escribir “El mayor es :”, NRO2
        sino
            escribir “El mayor es :”, NRO3*/



            int nro1;
            int nro2;
            int nro3;

            System.out.println("Ingresar 3 numeros enteros: ");
            nro1 = scanner.nextInt(); 
            nro2 = scanner.nextInt();
            nro3 = scanner.nextInt();

            if (nro1>nro2 && nro1>nro3) {
                System.out.println("el mayor es: "+nro1);
            }
            else{
                if (nro2>nro1 && nro2>nro3) {
                    System.out.println("El mayor es: "+nro2);    
                }
                else{
                    System.out.println("El mayor es: "+nro3);
                }
            }
        scanner.close();

    }
}
