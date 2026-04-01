import java.util.Scanner;

public class RainfallAdvisorySwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rainfall amount (mm): ");
        double rainfall = input.nextDouble();

        System.out.print("Enter temperature (°C): ");
        double temperature = input.nextDouble();

        int condition;

        if (rainfall < 200) {
            condition = 1;
        } else if (rainfall >= 200 && temperature > 30) {
            condition = 2;
        } else {
            condition = 3;
        }

        switch (condition) {

            case 1:
                System.out.println("Irrigation Required");
                break;

            case 2:
                System.out.println("Monitor Soil");
                break;

            case 3:
                System.out.println("Normal Conditions");
                break;

            default:
                System.out.println("Invalid Data");
        }

        input.close();
    }
}