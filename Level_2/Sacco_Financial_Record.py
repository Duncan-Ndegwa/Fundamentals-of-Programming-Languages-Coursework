name = input("Enter Member Name: ")
member_id = input("Enter Member ID: ")

total_savings = 0

for i in range(6):
    contribution = float(input("Enter contribution for month " + str(i+1) + ": "))
    total_savings += contribution

print("\nMember Summary")
print("Name:", name)
print("Member ID:", member_id)
print("Total Savings:", total_savings)
print()