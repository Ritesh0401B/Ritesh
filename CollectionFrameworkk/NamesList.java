package CollectionFrameworkk;

import java.util.ArrayList;

public class NamesList {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		// Add five names to the arrayList
		names.add("Amit");
		names.add("Sandeep");
		names.add("Rohan");
		names.add("Shivani");
		names.add("Jyoti");
		
		// Print the total number of names in the list
		System.out.println("Totel number of names: " + names.size());
		
		// Display the name at the second position(index 1) 
		System.out.println("Name of the second position: " + names.get(1));
		
		// Print all names in the list 
		System.out.println("All names in the list: ");
		
		for(String name : names) { 
			System.out.println(name);
		}
		
		
	}
}
