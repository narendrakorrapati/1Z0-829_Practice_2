package arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String... args) {
		
		sortArray();
		sortStringArray();
		
	}
	
	static void sortArray() {
		
		
		int[] numbers = {6, 1, 9};
		Arrays.sort(numbers);
		
		/*
		for(int i=0; i<numbers.length; i++) 
			System.out.print(numbers[i] + " ");
		*/
		System.out.println(Arrays.toString(numbers));
	}
	
	static void sortStringArray() {
		
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
	}
	
}