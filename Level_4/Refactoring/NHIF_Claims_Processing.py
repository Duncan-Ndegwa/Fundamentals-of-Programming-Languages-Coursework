def calculateClaim(amount):

    copayment = amount * 0.10
    approved_amount = amount - copayment

    return approved_amount


name = input("Enter patient name: ")
policy = input("Enter policy number: ")
amount = float(input("Enter claim amount: "))

approved = calculateClaim(amount)

print("\n--- Claim Summary ---")
print("Patient Name:", name)
print("Policy Number:", policy)
print("Claim Amount: KES.",amount)
print(f"Approved Amount (after 10% co-payment): KES.{approved}\n")