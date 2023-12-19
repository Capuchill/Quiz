import java.util.Scanner;

public class NotaRequerida {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double C1,C2,Nl;
        System.out.println("Ingrese nota certamen 1: ");
        C1 = leer.nextDouble();
        System.out.println("Ingrese nota certamen 2: ");
        C2 = leer.nextDouble();
        System.out.println("Ingrese nota laboratorio: ");
        Nl = leer.nextDouble();
        double Nc = (59.6-Nl*0.3)/0.7;
        double C3 = Nc * 3 - C1 - C2;
        System.out.println("Necesita nota " + Math.round(C3) + " en el certamen 3");
        leer.close();
    }
}
