#include <iostream>
using namespace std;

int main() {

    string username = "adminKE";
    string password = "254Secure";

    string usernameInput;
    string passwordInput;

    cout << "Enter username: ";
    cin >> usernameInput;

    cout << "Enter password: ";
    cin >> passwordInput;

    if(usernameInput == username && passwordInput == password){
        cout << "Access Granted";
    }
    else{
        cout << "Invalid Credentials";
    }

    return 0;
}