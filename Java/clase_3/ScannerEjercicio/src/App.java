import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribi tu nombre");
        String nombre = sc.nextLine();
        System.out.println("nombre= " + nombre);
        System.out.println("Escriba el titulo: ");
        String titulo = sc.nextLine();
        System.out.println("resultado: " + titulo);
    }
}
