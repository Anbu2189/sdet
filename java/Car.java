package session1;

public class Car {
	
	//Class Member variables
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	//Constructor
	Car(){
		tyres = 4;
		doors = 4;
	}
			
	//class methods
	public void displayCharacteristics(){
		System.out.println("Color of the car is:" +color);
		System.out.println("Make of the car is: " +make);
		System.out.println("Transmission of the car is: " +transmission);
		System.out.println("The number of tyres on the car is: " +tyres);
		System.out.println("The number of doors on the car is: " +doors);
	}
	public void accelerate() {
		System.out.println("The Car is moving forward.");
	}
	public void brake() {
		System.out.println("The Car has stopped.");
	}
	}

