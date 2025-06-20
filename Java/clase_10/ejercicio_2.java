import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un mes del año en numero del 1 al 12: ");
        int mes = sc.nextInt();
        sc.close();

        String estacion;

        if (mes >= 1 && mes <= 2 || mes == 12) {
            estacion = "Verano";
        } else if (mes >= 3 && mes <= 5) {
            estacion = "Otoño";
        } else if (mes >= 6 && mes <= 8) {
            estacion = "Invierno";
        } else if (mes >= 9 && mes <= 11) {
            estacion = "Primavera";
        } else {
            estacion = "Inválido";
        }

        System.out.println("La estación del año es: " + estacion);

    }
}
