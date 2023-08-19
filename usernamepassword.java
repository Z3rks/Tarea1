import java.util.Scanner;

/**
 * usernamepassword
 */
public class usernamepassword {

    public static void main(String[] args) {
         final String  CONTRASENABASE = "123";
         final String  USERNAME = "santiago";
        String  username, password;
    Scanner scanner = new Scanner(System.in);
    
    do {
        System.out.println("Digita tu username");
        username = scanner.nextLine();
        System.out.println("Digite password");
    password = scanner.nextLine();
} while ((password.equals(CONTRASENABASE) == false) && (username.equals(USERNAME) == false) );
scanner.close();
 System.out.println("Bienvenido al sistema ");

}
    }

