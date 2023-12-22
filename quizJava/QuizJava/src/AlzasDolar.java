import java.util.Scanner;
import java.util.ArrayList;

public class AlzasDolar {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.print("Cantidad de dias: ");
        int numDias = leer.nextInt();
        ArrayList<Double> dolares = new ArrayList<>();
        double dolar = 0;
        double mayor = 0;

        for (int i = 0; i < numDias; i++) {
            System.out.print("\nDia " + (i+1) + ": ");
            dolar = leer.nextDouble();
            dolares.add(dolar);   
        }

        
        double resta = dolares.get(0);

        for (int i = 1; i < dolares.size(); i++) {
            resta = (resta - dolares.get(i))*-1;
            System.out.println(resta);

            if (resta>mayor) {
                mayor = resta;
            }
            resta = dolares.get(i);
        }
     

        if (mayor == 0) {
            System.out.println("No hubo alzas");
        }else{
            System.out.println("La mayor alza fue de: " + mayor);
        }
        
        leer.close();
    }
}
