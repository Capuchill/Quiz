import java.util.Scanner;

public class Pitagoras {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        double a,b,h;
        System.out.println("Ingrece el cateto 1: ");
        a = leer.nextDouble();
        System.out.println("Ingrese el cateto 2: ");
        b = leer.nextDouble();
        h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("La hipotenusa es: " + h);
        leer.close();
    }
}
