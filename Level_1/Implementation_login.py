#Asks the user to type a username and password.
username_input = input("Enter username: ")
password_input = input("Enter password: ")

#Two variables store the correct credentials.
username = "adminKE"
password = "254Secure"

#The if statement compares the user input with the stored credentials. If both match; access granted.If not; invalid credentials.
if username_input == username and password_input == password:
    print("Access Granted")
else:
    print("Invalid Credentials")