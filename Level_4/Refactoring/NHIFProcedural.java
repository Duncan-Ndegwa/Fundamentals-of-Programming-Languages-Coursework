import java.util.Scanner;

public class NHIFProcedural {

    static double calculateClaim(double amount) {

        double copayment = amount * 0.10;
        return amount - copayment;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = input.nextLine();

        System.out.print("Enter policy number: ");
        String policy = input.nextLine();

        System.out.print("Enter claim amount: ");
        double amount = input.nextDouble();

        double approved = calculateClaim(amount);

        System.out.println("\n--- Claim Summary ---");
        System.out.println("Patient Name: " + name);
        System.out.println("Policy Number: " + policy);
        System.out.println("Claim Amount: KES."+ amount);
        System.out.println("Approved Amount (after 10% co-payment): KES."+ approved);

        input.close();
    }
}