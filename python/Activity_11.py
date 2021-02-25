  
fruits = set(input("Enter the furit set: ").split(" "))	

fruit_dict = {}
for fruit in fruits:
    fruit_dict[fruit] = float(input("Enter the price for "+ fruit +": "))

print("Apple is available", fruit_dict["Apple"])