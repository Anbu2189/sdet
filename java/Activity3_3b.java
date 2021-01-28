package session3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Activity3_3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Deque
		Deque<String> dq = new ArrayDeque<>();
		dq.add("Tiger");
		dq.add("Lion");
		dq.add("Cheetah");
		
		//Other ways of adding elements to queues
		dq.offer("Wolf");
		dq.offerFirst("Hyena");
		dq.offerLast("Panther");
		
		//Iterate through the queue elements
		Iterator<String> iterator = dq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Peek at head element
		System.out.println("Peek_first: " + dq.peekFirst());
		System.out.println("Peek_Last: " + dq.peekLast());
		//To show that the element have not been deleted
        System.out.println("After peek: " + dq);
        
      //Search for element
        System.out.println("Contains Wolf?: " + dq.contains("Wolf"));
        

        //Remove the first and last element
        dq.removeFirst();
        dq.removeLast();
        System.out.println("dq after removing first and last elements: " + dq);
        System.out.println("Size of deque after removal: " + dq.size());
	}

}
