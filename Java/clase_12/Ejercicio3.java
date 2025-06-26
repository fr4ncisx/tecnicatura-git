/*Ejercicio 3: La calificacion final de un estudiante de informática

se calcula con base a las calificaciones de cuatro aspectos de su

rendimiento académico: participación, primer examen parcial, segundo

examen parcial y examen final. Sabiendo que las calificaciones anteriores

entran a la calificación final con ponderaciones de 10%, 25%, 25%

y 40%, Hacer un programa que calcule e imprima la calificación final

obtenida por un estudiante. 

Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,

la calificación final.


*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Participación: ");
        double participacion = sc.nextDouble();

        System.out.print("Primer examen parcial: ");
        double parcial1 = sc.nextDouble();

        System.out.print("Segundo examen parcial: ");
        double parcial2 = sc.nextDouble();

        System.out.print("Examen final: ");
        double examenFinal = sc.nextDouble();

        sc.close();

        double finalNota = participacion * 0.10 + parcial1 * 0.25 + parcial2 * 0.25 + examenFinal * 0.40;

        System.out.println("Calificación final: " + finalNota);
    }
}
