import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double nota1;
        Double nota2;
        Double nota3; 
        Double promedio;

        System.out.println("Escribir las tres calificaciones");
        System.out.println("Calificacion 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Calificacion 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Calificacion 3: ");
        nota3 = sc.nextDouble();

        promedio = (nota1+nota2+nota3)/3;

        if(promedio >= 7)
            System.out.println("El alumno está aprobado con " + promedio);
        else
            System.out.println("El alumno está desaprobado con " + promedio);

        sc.close();
    }
}
