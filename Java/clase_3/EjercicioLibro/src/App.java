import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean camposValidos = false;
            String nombreLibro;
            String nombreAutor;
    
            do {
                System.out.println("Ingresa el nombre de tu libro favorito");
                nombreLibro = sc.nextLine();
                nombreLibro = textoVacio(nombreLibro);
                System.out.println("El nombre del libro está vacio");
                if (nombreLibro != null) {
                    System.out.printf("Ingresa el nombre del autor de tu libro %s %n", nombreLibro);
                    nombreAutor = sc.nextLine();
                    nombreAutor = textoVacio(nombreAutor);
                    if (nombreAutor != null) {
                        camposValidos = true;
                        System.out.printf("El nombre de tu libro es %s fue escrito por %s", nombreLibro, nombreAutor);
                    }
                }
            } while (!camposValidos);
            sc.close();
        }
    
        private static String textoVacio(String s) {
            if (s.isBlank())
                return null;
            return s;
        }
    }