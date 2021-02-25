num = list(input("Enter a sequence of space separated values to form a list: ").split(" "))	
sum = 0

for number in num:	
  sum += int(number)
print("The sum of all numbers in the list is",sum)