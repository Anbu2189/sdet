numList = list(input("Enter a sequence of space separated values to form a Number list: ").split(" "))	

def sum(numbers):	
	sum = 0	
	for num in numbers:
		sum += int(num)
	return sum
	
print("The sum of all the elements is: " , sum(numList))