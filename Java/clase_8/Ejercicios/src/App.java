public class App {
    public static void main(String[] args) {

        /* PRIMER EJERCICIO */
        long perimetro;
        long area;
        long alto = 21;
        long ancho = 35;

        perimetro = 2 * (alto+ancho);
        area = alto * ancho;

        System.out.println("El perimetro es " + perimetro + " cm");
        System.out.println("El area es " + area + " cm");


        /* SEGUNDO EJERCICIO */

        int firstNum = 100;
        int secondNum = 103;

        boolean isBigger = firstNum >= secondNum ?  true : false;

        if(isBigger)
            System.out.println("El número " + firstNum + " es el más grande");
        else
            System.out.println("El número " + secondNum + " es el más grande");
    }
}
