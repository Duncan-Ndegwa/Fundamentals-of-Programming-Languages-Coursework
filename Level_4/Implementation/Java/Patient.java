public class Patient {

    private String name;
    private String policyNumber;

    public Patient(String name, String policyNumber) {
        this.name = name;
        this.policyNumber = policyNumber;
    }

    public double calculateClaim(double amount) {

        double copayment = amount * 0.10;
        double approvedAmount = amount - copayment;

        return approvedAmount;
    }

    public String getName() {
        return name;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }
}