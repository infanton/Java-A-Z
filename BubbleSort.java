/*
 * Author: 	Niko Infanto
 * Date: 	03.04.2020
 * About:	Bubble Sort Implementation
 */
 
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) 
	{
		// create initial array
		int[] arr = new int[] {5, 2, 3, 7, 1};
		System.out.println("Initial Array: " + Arrays.toString(arr));
		System.out.println("Array Size: " +arr.length + "\n");
		
		// call the bubble sort method
		System.out.println(">> BUBBLE SORT HAS STARTED ..");
		bubbleSort(arr);
		System.out.println("\n>> BUBBLE SORT HAS COMPLETED.");
		
		// print sorted array
		System.out.println("\nSorted Array: " + Arrays.toString(arr));		
	}
	
	/**
	 * A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. 
	 * 
	 * Best Case: 	 O(n)
	 * Average Case: O(n^2)
	 * Worst Case:	 O(n^2)
	 * 
	 * @param array a pointer reference to an array of integer values
	 */
	private static void bubbleSort(int[] array) 
	{
		boolean hasSwapOccurred;

		// repeatedly check adjacent items until no swap has occurred 
		do 
		{
			System.out.println("\n >>> " + Arrays.toString(array));
			
			// reset hasSwapOccurred before next iteration
			hasSwapOccurred = false;
			
			// iterate through the array and check if an adjacent value needs swapped
			for(int i = 0; i < array.length - 1; i++)
			{
				// print array to console 
				printArray(array, i);
        
				// check if adjacent value is smaller (ASC order)
				if(array[i] > array[i+1])
				{
					// swap values
					swap(array, i, i+1);
					
					// update hasSwapOccurred 
					hasSwapOccurred = true;
				}
			} // end for loop
			
		} while (hasSwapOccurred == true);
	}

		// helper method to swap index values
		public static void swap(int[] arr, int a, int b)
		{
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}

		/**
		 * A simple algorithm to format internal sorting structure and output results to the screen 
		 * 
		 * @param array a pointer reference to an array of integer values
		 * @param index the integer value of the current iteration 
		 */
		public static void printArray(int[] arr, int index) 
		{		
			// create string builder
			StringBuilder str = new StringBuilder();

			// append step number
			str.append("\tSTEP " + index + ": [");

			// loop through the array
			for (int i = 0; i < arr.length; i++) 
			{
				// string formatting conditions
				if (i != arr.length - 1) 
				{
					if (i == index) {str.append("("); str.append(arr[i]); str.append(", ");} 
					else if (i == index + 1) {str.append(arr[i]); str.append("), ");} 
					else {str.append(arr[i]); str.append(", ");} 
				} 
				else 
				{
					if (i == index + 1) {str.append(arr[i]); str.append(")");}
					else str.append(arr[i]); {str.append("]");}			
				}				
			}
			// print string to console
			System.out.println(str.toString());		
		} 
} 
