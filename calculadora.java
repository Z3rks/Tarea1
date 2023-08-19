
import java.util.Scanner;
/**
 * calculadora
 */
public class calculadora {

public static void main(String[] args) {

    System.out.println("Digite los numeros para operar");
   Scanner scanner = new Scanner(System.in);
   int n1 = scanner.nextInt();
   int n2 = scanner.nextInt();
   scanner.close();

    System.out.println("Suma " + (n1 + n2));
    System.out.println("Resta " + (n1 - n2));
    System.out.println("Multiplicacion " + (n1 * n2));
    System.out.println("Division " + (n1 / n2));
    
}
}