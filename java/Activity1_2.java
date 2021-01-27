package session1;

import java.util.Arrays;

public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize an array
		int[] numArr = {10, 77, 10, 54, -11, 10}; 
		System.out.println("Original Array is: " + Arrays.toString(numArr));
		
		//Set Constants
		int searchNum = 10;
		int fixedSum = 30;
		
		//print result
		System.out.println("Result is:" +result(numArr, searchNum, fixedSum));

	}

		public static boolean result(int[] numbers, int searchNum, int fixedSum) {
			int temp_sum = 0;
			//Loop through the array
			for (int number : numbers) {
				//If Value is 10
				if (number == searchNum) {
					//Add them
					temp_sum += searchNum; 
				}
				//Sum shouldn't be more than 30
				if (temp_sum > fixedSum) {
					break;
				}
			}
			//Return true if condition satisfies
			return temp_sum == fixedSum;
		}
}
