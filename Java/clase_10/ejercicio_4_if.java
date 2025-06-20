import java.util.Scanner;

public class ejercicio_4_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificación del 1 al 10: ");
        double calificacion = sc.nextDouble();
        sc.close();

        if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else {
            System.out.println("Calificación inválida");
        }
    }
}
