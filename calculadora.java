import java.util.Scanner;
/**
 * calculadora
 */
public class calculadora {

public static void main(String[] args) {

        System.out.println("Bienvenido a Calculadora");
        int i;
        i = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite el primer número ");

            double n1 = scanner.nextDouble();
            System.out.println("Digite el segundo número ");
            double n2 = scanner.nextDouble();
            

            System.out.println("Suma: " + (n1 + n2));
            System.out.println("Resta: " + (n1 - n2));
            System.out.println("Multiplicación: " + (n1 * n2));
            System.out.println("División: " + (n1 / n2));
            System.out.println("¿Quieres seguir operando? Si=1, No=0");

            i = scanner.nextInt();


          } while (i == 1); 
        scanner.close();

    }
}