import java.util.Scanner;

public class SaccoRecord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Member Name: ");
        String name = input.nextLine();

        System.out.print("Enter Member ID: ");
        String id = input.nextLine();

        double totalSavings = 0;

        for(int i = 1; i <= 6; i++){
            System.out.print("Enter contribution for month " + i + ": ");
            double contribution = input.nextDouble();
            totalSavings += contribution;
        }

        System.out.println("\nMember Summary");
        System.out.println("Name: " + name);
        System.out.println("Member ID: " + id);
        System.out.println("Total Savings: " + totalSavings);
    }
}