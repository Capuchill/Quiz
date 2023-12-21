import java.util.ArrayList;
import java.util.Scanner;

public class CortaLarga {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String larga = "";
        String corta = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        ArrayList<String> palabras = new ArrayList<>();

        String palabra;
        System.out.print("¡Hola!¿Cuantas palabras deseas ingresar?\n->");
        int numPalabras = leer.nextInt();
        System.out.print("\nIngresa las palabras!\n");

        for (int i = 0; i < numPalabras; i++) {
            System.out.print("->");
            palabra = leer.next();// El error
            palabras.add(palabra);
        }

        for (String element : palabras) {

            if (element.length() > larga.length()) {
                larga = element;
            } else {
                if (element.length() < corta.length()) {
                    corta = element;
                }
            }
        }

        System.out.println("\nLa palabra mas larga es " + larga);
        System.out.println("La palabra mas corta es " + corta);

        leer.close();
    }

}
