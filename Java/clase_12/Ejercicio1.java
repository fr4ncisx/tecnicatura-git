/*

Ejercicio 1: Construir un programa que, dado un número total de

horas, devuelve el número de semanas, días y horas equivalentes.

Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

6 días y 16 horas.


 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas totales: ");
        int horaInput = sc.nextInt();
        sc.close();

        int semanas = horaInput / 168;
        int dias = (horaInput % 168) / 24;
        int horas = horaInput % 24;

        System.out.printf("semanas: %s, días: %s, horas: %s ", semanas, dias, horas);
    }
}
