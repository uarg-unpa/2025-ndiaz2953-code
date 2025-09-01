package Tp_N1;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Leer tres números enteros dentro de las variables NUM1, NUM2 y NUM3 respectivamente y calcular e
        imprimir el producto y la suma de ellos. Repita la operación anterior, pero esta vez, para los tres valores utilizar
        una sola variable (NUM). 
        Algoritmo 1:
            leer NUM1, NUM2, NUM3
            PRODUCTO = NUM1 * NUM2 * NUM3
            SUMA = NUM1 + NUM2 + NUM3
            escribir “Suma de enteros: ”, SUMA
            escribir “Producto de enteros” , PRODUCTO
        
        Algoritmo 2:
            PRODUCTO = 1;
            SUMA = 0;
            CONT = 1;
            mientras (CONT <= 3) {
                leer NUM;
                SUMA = SUMA + NUM;
                PRODUCTO = PRODUCTO * NUM;
                CONT = CONT + 1;
            }
            escribir “Suma de enteros: ”, SUMA;
            escribir “Producto de enteros” , PRODUCTO;
        */

        //Algortimo 1

        int num1, num2, num3, sum, prod, cont, num;

        System.out.println("Ingresar 3 numeros: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        sum = num1+num2+num3; 

        prod = num1 * num2 * num3;

        System.out.println("La suma es: "+sum);
        System.out.println("El producto es: "+prod);
        

        //Algoritmo 2
        
        prod = 1;
        sum = 0;
        cont = 1; 

        while (cont <= 3) {
            System.out.println("Ingresar valor: ");
            num = scanner.nextInt();
            cont += 1; 
            sum += num;
            prod *= num;
        }
        System.out.println("La suma es: "+sum);
        System.out.println("El producto es: "+prod);





        scanner.close();
    }
}
