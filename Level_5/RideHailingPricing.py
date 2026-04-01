class RideFare:

    def __init__(self):
        self.base = 200
        self.rate = 50

    def calculateFare(self, distance):
        return self.base + (distance * self.rate)


ride = RideFare()

distance = float(input("Enter distance (km): "))
print("Total Fare:", ride.calculateFare(distance), "KES")