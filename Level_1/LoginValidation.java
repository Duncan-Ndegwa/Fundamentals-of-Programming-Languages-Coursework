import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "adminKE";
        String password = "254Secure";

        System.out.print("Enter username: ");
        String usernameInput = input.nextLine();

        System.out.print("Enter password: ");
        String passwordInput = input.nextLine();

        if(usernameInput.equals(username) && passwordInput.equals(password)){
            System.out.println("Access Granted");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}