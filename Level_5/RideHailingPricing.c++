#include <iostream>
using namespace std;

int main() {

    double distance;
    double baseFare = 200;
    double costPerKm = 50;

    cout << "Enter distance (km): ";
    cin >> distance;

    double totalFare = baseFare + (distance * costPerKm);

    cout << "Total Fare: " << totalFare << " KES";

    return 0;
}