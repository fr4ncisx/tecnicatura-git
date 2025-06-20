import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double compra;
        double descuento;
        double precioFinal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el precio de compra: ");
        compra = sc.nextDouble();

        if (compra > 100)
            descuento = compra * 0.2;
        else
            descuento = 0;

        precioFinal = compra - descuento;

        System.out.println("El precio final es: " + precioFinal);
        sc.close();
    }

}
