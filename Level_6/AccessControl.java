import java.util.Scanner;

public class AccessControl {

    static void checkAccess(String role) throws Exception {
        
        
        if (!role.equals("Doctor")) {
            throw new Exception("Access Denied: Unauthorized Role");
        }

        System.out.println("Access Granted");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter role: ");
        String role = input.nextLine();

        try {

            checkAccess(role);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        
        input.close();
    }
}