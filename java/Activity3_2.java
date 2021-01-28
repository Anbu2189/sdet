package session3;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create new Hashset
		HashSet<String> hs = new HashSet<>();
		//Adding elements to Hashset
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		
		//print Hashset
		System.out.println("Original Hashset is:" + hs);
		//print size of Hashset
		System.out.println("The size of Hashset is:" + hs.size());
		//Remove element
		hs.remove("E");
		//Remove element that is not present
		if(hs.remove("Z")) {
			System.out.println("Z removed from the set");
		}
		else {
			System.out.println("Z is not removed from the set");
		}
		//Search for element
		System.out.println("Check if B is present in the set?:" + hs.contains("B"));
		//Print updated HashSet
		System.out.println("The updated Hashset is: " + hs);
	}

}
