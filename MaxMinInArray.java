package dec27;

public class MaxMinInArray {
	
	public static void findMaxMin(int [] arr) {
		
		if(arr == null || arr.length == 0) {
			System.out.println("Array is empty ot null.");
			
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int num : arr) {
			if(num > max) {
				max = num;
			} else if(num < min) {
				min = num;
			}
		}
		
		System.out.println("Maximum: "+ max);
		System.out.println("Minimum: "+ min);
		
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {3, 1, 4, 1, 5, 9, 2, 6};
		
		findMaxMin(arr);
		
	}

}
