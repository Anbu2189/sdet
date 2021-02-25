list1 = list(input("Enter a sequence of space separated values to form a list_1: ").split(" "))	
list2 = list(input("Enter a sequence of space separated values to form a list_2: ").split(" "))	

for num in list1:
    if (int(num) % 2 != 0):
        new_list.append(num)
print("The Odd number list from list_1",new_list)

for num in list2:
    if (int(num) % 2 == 0):
        new_list.append(num)
print("The even numbers added from list_2",new_list)