import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un mes del año (1-12): ");
        int mes = sc.nextInt();
        sc.close();

        String estacion = switch (mes) {
            case 12, 1, 2 -> "Verano";
            case 3, 4, 5 -> "Otoño";
            case 6, 7, 8 -> "Invierno";
            case 9, 10, 11 -> "Primavera";
            default -> "Mes no válido";
        };

        System.out.println("La estación del año es: " + estacion);
    }
}
