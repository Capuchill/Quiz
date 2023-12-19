import java.util.Scanner;

public class ParteDecimal {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        double x;
        double entero;
        double decimal;
        System.out.println("Ingrese el decimal: ");
        x = leer.nextDouble();
        decimal = x % 1;
        entero = x - decimal;
        if (decimal<0) {
            decimal = decimal*-1;
        } 
        System.out.println("Parte entera: " + (int)entero + " Parte decimal: " + decimal);
        leer.close();
    }
}
