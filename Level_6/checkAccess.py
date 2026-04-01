def checkAccess(role):

    if role != "Doctor":
        raise Exception("Access Denied: Unauthorized Role")

    print("Access Granted")


try:
    role = input("Enter role: ")
    checkAccess(role)
    

except Exception as e:
    print(e)