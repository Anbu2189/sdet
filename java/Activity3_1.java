package session3;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
	
	//declaring Arraylist of String objects	
	ArrayList<String> myList = new ArrayList<String>();
	//Adding objects to Array List at default index
	myList.add("Apple");
	myList.add("Orange");
	myList.add("Mango");
	
	//Adding object at specific index
	myList.add(3,"Grapes");
	myList.add(1,"Pomegranate");	
	
	//Print all the names using for loop
	System.out.println("Print all the names: ");
	for(String s:myList) {
		System.out.println(s);
	}
	//3rd name in ArrayList
	System.out.println("3rd element in the list is: " + myList.get(2));
	//Contains if present in ArrayList
	System.out.println("Chikku present in the list?: " + myList.contains("chikku"));
	//Print size of ArrayList
	System.out.println("Size of arraylist before removal: " + myList.size());
	
	//remove object from Array List
	myList.remove("Pomegranate");
	//Print size of ArrayList after removal
	System.out.println("Size of arraylist after removal: " + myList.size());
	}

}
