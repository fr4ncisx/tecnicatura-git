/*

Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,

el usuario debe ingresar el valor de a y el valor de b.

Formula: (a+b)2=a2+b2+2*a*b

Para esto deberán utilizar la clase Math y un método llamado pow


 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = sc.nextDouble();

        sc.close();

        double resultado = Math.pow(a + b, 2);

        System.out.println("El resultado de (a + b)^2 es: " + resultado);
    }
}
