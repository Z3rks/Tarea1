import java.util.Scanner;

public class usernamepassword {
      public static void main(String[] args) {
         final String  contrasenabase = "123";
        String  usuario, contrasena;
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa tu username");
    usuario = scanner.next();
    do {
        System.out.println("Digite tu password");
        contrasena = scanner.next();


    } while (contrasena.equals(contrasenabase) == false);
    scanner.close();
     System.out.println("Bienvenido al sistema ");

    }
}

