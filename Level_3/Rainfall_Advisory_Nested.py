rainfall = float(input("Enter rainfall amount (mm): "))
temperature = float(input("Enter temperature (°C): "))

if rainfall < 200:
    print("Irrigation Required")
else:
    if temperature > 30:
        print("Monitor Soil")
    else:
        print("Normal Conditions")