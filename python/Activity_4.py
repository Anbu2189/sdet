while True:
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
            startover = input("Player_1 provided invalid input. Do you want to try again : yes/no? ").lower()
            if startover == "yes":
                continue
            elif startover == "no":
                raise SystemExit
            else:
                print("That is not expected. Please do start again")
                raise SystemExit 
        elif player2 not in ("rock","paper","scissors"):
            startover = input("Player_2 provided invalid input. Do you want to try again : yes/no? ").lower()
            if startover == "yes":
                continue
            elif startover == "no":
                raise SystemExit
            else:
                print("That is not expected. Please do start again")
                raise SystemExit        
    startover = input("Do you want to Play once again : yes/no? ").lower()
    if startover == "yes":
        continue
    elif startover == "no":
        raise SystemExit
    else:
        print("That is not expected. Please do start again")
        raise SystemExit