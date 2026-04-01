import java.util.Scanner;

public class RainfallAdvisory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rainfall amount (mm): ");
        double rainfall = input.nextDouble();

        System.out.print("Enter temperature (°C): ");
        double temperature = input.nextDouble();

        if (rainfall < 200) {
            System.out.println("Irrigation Required");

        } else if (rainfall >= 200 && temperature > 30) {
            System.out.println("Monitor Soil");

        } else {
            System.out.println("Normal Conditions");
        }
    }
}