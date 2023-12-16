/* public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}; */


/* public class App{
    public static void main(String[] args){
        System.out.println("julian gay");
    }
};
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        int a= leer.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b = leer.nextInt();
        int rta = a + b;
        System.out.println("La suma es: " + rta);
        leer.close();
    }
    
}

