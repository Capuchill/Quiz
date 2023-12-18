import java.util.Scanner;

public class PromedioNotas {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int nota1,nota2,nota3,nota4;
        double promedio = 0;
        System.out.println("Ingrese la nota1 : ");
        nota1 = leer.nextInt();
        System.out.println("Ingrese la nota2 : ");
        nota2 = leer.nextInt();
        System.out.println("Ingrese la nota3 : ");
        nota3 = leer.nextInt();
        System.out.println("Ingrese la nota4 : ");
        nota4 = leer.nextInt();
        promedio = (nota1+nota2+nota3+nota4)/4;
        System.out.println("El promedio es: " + promedio);
        leer.close();
    }
}

// uwu