package CollectionFrameworkk;

import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		
		// Creating an Array list  of integer 
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// Add numbers 1 to 5 to the list 
		
		for(int i=1; i<=5; i++) {
			numbers.add(i);
		}
		System.out.println("Original List: " + numbers);
		
		// Remove number 3 from the list
		
		numbers.remove(Integer.valueOf(3));
		
		System.out.println("After removing 3: " +numbers);
		
		// Printing elements in the list
		
		System.out.println("Elements in the list: ");
		for(int number : numbers) { 
			System.out.println(number);
		}
		
	}
}
