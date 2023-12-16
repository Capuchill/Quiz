import java.util.Scanner;

public class Conversor {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        double x,r;
        System.out.println("Ingrese la longitud: ");
        x = leer.nextDouble();
        r = x / 2.54;
        System.out.println(x + " cm = " + r );
        leer.close();
    }
}
