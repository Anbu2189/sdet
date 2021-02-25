#Get the inputs
player1 = input("Player_1 input : ").lower()
player2 = input("Player_2 input : ").lower()

if player1==player2:
    print("Both players provided same input as "+ player2 + ". Please Start again")
elif (player1 == "rock" or player2 == "rock") and (player1 == "paper" or player2 == "paper"):
    print("Paper wins")
elif (player1 == "rock" or player2 == "rock") and (player1 == "scissors" or player2 == "scissors"):
    print("Rock wins")
elif (player1 == "paper" or player2 == "paper") and (player1 == "scissors" or player2 == "scissors"):
    print("Scissors wins")
else:
    if player1 not in ("rock","paper","scissors"):
        print("Player_1 provided invalid input. Please try again")
    elif player2 not in ("rock","paper","scissors"):
        print("Player_2 provided invalid input. Please try again")