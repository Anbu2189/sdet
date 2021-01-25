package session1;

public class Activity1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carName = new Car();
		carName.color = "Black";
		carName.make = 2014;
		carName.transmission = "Manual";
		
		//Using Car class method
		carName.displayCharacteristics();
		carName.accelerate();
		carName.brake();
	}

}
