command = input("Enter transaction rule: ")

parts = command.split()

amount = int(parts[1])
sender = parts[3]
receiver = parts[5]
balance_limit = int(parts[9])

balance = 8000

if balance > balance_limit:
    print("Transaction Approved")
    print("Transferred", amount, "from", sender, "to", receiver)

else:
    print("Transaction Declined: Insufficient Balance")