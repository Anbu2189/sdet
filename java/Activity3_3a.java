package session3;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Queue
		Queue<Integer> q = new LinkedList<>();
		
		//Add first 5 natural numbers
		q.add(0);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		
		//Using for loop
//		for(int i=0; i<5; i++) {
//			q.add(i);
//		}
		//Display contents of the queue.
		System.out.println("The numbers in the queue are: " + q);
		//To remove the head of queue.
		System.out.println("Removed element: " + q.remove());
		System.out.println("The numbers in the queue are: " + q);
		//To view the head of queue
		System.out.println("Head of queue: " + q.peek());
		//Size of the queue
		System.out.println("The size of the queue is: " + q.size());
		
		//Updated queue
		System.out.println("The numbers in the queue after update are: " + q);
		System.out.println("---------------------------------------------------");
		//Create an empty queue
		//Create a Queue
		Queue<Integer> q1 = new LinkedList<>();
		System.out.println("Empty queue: " + q1);
		
		System.out.println("Peek method of queue when empty: " + q1.peek());
	}

}
