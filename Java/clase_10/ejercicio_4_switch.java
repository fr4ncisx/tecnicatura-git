import java.util.Scanner;

public class ejercicio_4_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificación del 1 al 10: ");
        int calificacion = sc.nextInt();
        sc.close();

        String letra;

        letra = switch (calificacion) {
            case 0, 1, 2, 3, 4, 5 -> "F";
            case 6 -> "D";
            case 7 -> "C";
            case 8 -> "B";
            case 9, 10 -> "A";
            default -> "Calificación inválida";
        };
        System.out.println(letra);
    }
}
