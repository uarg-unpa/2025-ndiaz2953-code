package Tp_N1;

public class ej1{
    public static void main(String[] args) {
        
/*Se tienen 3 variables A, B y C enteras. Escribir un algoritmo que intercambie entre si sus valores, para que queden finalmente de la siguiente forma: 
B y C toman el valor de A.
A toma el valor original de C
Ejemplo: Si A tiene el valor 1, B tiene el valor 2, y C tiene el valor 3, entonces debería quedar B con 1, C con 1 y A con 3.
Nota: sólo se debe utilizar una variable auxiliar como ayuda.*/


        int a = 1;
        int b = 2;
        int c = 3; 

        System.out.println( "los valores son: " +a+b+c);
        
        b = a;
        c = a;
        a = c;

        System.out.println( "los valores ahora son: " +a+b+c);

    }
}