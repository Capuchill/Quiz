import java.util.Scanner;

public class MaquinaAlimentos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A = 270, B = 340, C = 390;
        System.out.print("Elija un producto: ");
        String eleccion = leer.next();
        eleccion = eleccion.toUpperCase();
        int totalMonedas = 0;

        switch (eleccion) {
            case "A":
                System.out.println("\nIngrese las monedas:\n");
                do {
                    System.out.print("-> ");  
                    int monedas = leer.nextInt();
                    totalMonedas += monedas;
                } while (totalMonedas<A);
                
                if (totalMonedas == A) {
                    System.out.println("Su vuelto:");
                    System.out.println("No hay vuelto. Pago completo.");
                } else {
                    System.out.println("Su vuelto:");
                    int vuelto = totalMonedas - A;
                    if (vuelto>=50 && vuelto<100) {
                        System.out.println(50);
                        vuelto = vuelto - 50;
                        while (vuelto>0){
                          System.out.println(10);
                          vuelto = vuelto - 10;  
                        };
                    }
                    if (vuelto<50) {
                        while (vuelto>0){
                          System.out.println(10);
                          vuelto = vuelto - 10;  
                        };
                    }
                }
                break;
            case "B":
                System.out.println("\nIngrese las monedas:\n");
                do {
                    System.out.print("-> ");  
                    int monedas = leer.nextInt();
                    totalMonedas += monedas;
                } while (totalMonedas<B);
                
                if (totalMonedas == B) {
                    System.out.println("Su vuelto:");
                    System.out.println("No hay vuelto. Pago completo.");
                } else {
                    System.out.println("Su vuelto:");
                    int vuelto = totalMonedas - B;
                    if (vuelto>=50 && vuelto<100) {
                        System.out.println(50);
                        vuelto = vuelto - 50;
                        while (vuelto>0){
                          System.out.println(10);
                          vuelto = vuelto - 10;  
                        };
                    }
                    if (vuelto<50) {
                        while (vuelto>0){
                          System.out.println(10);
                          vuelto = vuelto - 10;  
                        };
                    }
                }
                break;
            case "C":
                System.out.println("\nIngrese las monedas:\n");
                do {
                    System.out.print("-> ");  
                    int monedas = leer.nextInt();
                    totalMonedas += monedas;
                } while (totalMonedas<C);
                
                if (totalMonedas == C) {
                    System.out.println("Su vuelto:");
                    System.out.println("No hay vuelto. Pago completo.");
                } else {
                    System.out.println("Su vuelto:");
                    int vuelto = totalMonedas - C;
                    if (vuelto>=50 && vuelto<100) {
                        System.out.println(50);
                        vuelto = vuelto - 50;
                        while (vuelto>0){
                          System.out.println(10);
                          vuelto = vuelto - 10;  
                        };
                    }
                    if (vuelto<50) {
                        while (vuelto>0){
                          System.out.println(10);
                          vuelto = vuelto - 10;  
                        };
                    }
                }
                break;   
            default:
                System.out.println("Este producto no se encuentra registrado");
                break;
        }


    }
}
