base = 200
rate = 50

fare = lambda distance: base + (distance * rate)

distance = float(input("Enter distance: "))
print("Total Fare:", fare(distance), "KES")