import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double num1, num2, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribir primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Escribir segundo número: ");
        num2 = sc.nextDouble();

        if(num1 == num2)
            resultado = num1 * num2;
        else if(num1 > num2)
            resultado = num1-num2;
        else
            resultado = num1+num2;

        System.out.println("El resultado es " + resultado);

        sc.close();
    }
}
