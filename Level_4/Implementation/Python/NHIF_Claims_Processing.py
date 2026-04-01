class Patient:

    def __init__(self, name, policy_number):
        self.name = name
        self.policy_number = policy_number

    def calculateClaim(self, amount):

        copayment = amount * 0.10
        approved_amount = amount - copayment

        return approved_amount


name = input("Enter patient name: ")
policy = input("Enter policy number: ")
amount = float(input("Enter claim amount: "))

patient = Patient(name, policy)

approved = patient.calculateClaim(amount)

print("\n--- Claim Summary ---")
print("Patient Name:", patient.name)
print("Policy Number:", patient.policy_number)
print("Claim Amount:", amount)
print(f"Approved Amount (after 10% co-payment):, {approved} \n")