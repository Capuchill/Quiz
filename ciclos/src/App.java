import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese varios valores, recuerde que para finalizar debe digitar '0' :) \n");
        int x;
        ArrayList<Integer> negativoList = new ArrayList<>();
        ArrayList<Integer> positivoList = new ArrayList<>();
        do {
            System.out.print("-> ");
            x = leer.nextInt();
            if (x>0) {
                positivoList.add(x);
            } else {
                if (x<0) {
                    negativoList.add(x);
                }
            }
        } while (x != 0);

        System.out.print("\nNumeros positivos: ");

        for (int index = 0; index < positivoList.size(); index++) {
            System.out.print("*");
        }

        System.out.print("\nNumeros negativos: ");

        for (int index = 0; index < negativoList.size(); index++) {
            System.out.print("*");
        }
        leer.close();
    }
}
