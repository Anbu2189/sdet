tup = tuple(input("Enter a sequence of space separated values to form a tuple: ").split(" "))	

new_list = []
for num in tup:
    if (int(num) % 5 == 0):
        new_list.append(num)
print("The list of numbers divisible by 5",new_list)