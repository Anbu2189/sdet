import datetime

#Get name and age
name = input("Please enter your name : ")
age = int(input("Please enter your age : "))

#Calculate the no. of years left
lifespan = 100
yearleft = lifespan - age

#Calculate the exact year to reach 100
now = datetime.datetime.now()
currentyear = now.year
exactyear = currentyear + yearleft

#Format and Print
message = "Hi {}, you will turn 100 on {}"
print(message.format(name,exactyear))