import java.util.Scanner;

public class NHIFSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = input.nextLine();

        System.out.print("Enter policy number: ");
        String policy = input.nextLine();

        System.out.print("Enter claim amount: ");
        double amount = input.nextDouble();

        Patient patient = new Patient(name, policy);

        double approvedAmount = patient.calculateClaim(amount);

        System.out.println("\n--- Claim Summary ---");
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Policy Number: " + patient.getPolicyNumber());
        System.out.println("Claim Amount: " + amount);
        System.out.println("Approved Amount (after 10% co-payment): " + approvedAmount);

        input.close();
    }
}