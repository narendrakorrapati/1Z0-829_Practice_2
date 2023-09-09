package arrays;

import java.util.Arrays;

public class ArrayCompare {

	public static void main(String args[]) {
		
		int numbers1[] = {1, 2};
		int numbers2[] = {1};
		
		System.out.println(Arrays.compare(numbers1, numbers2));
		System.out.println(Arrays.compare(numbers2, numbers1));
		
		
		System.out.println(Arrays.mismatch(numbers1, numbers2));
		
	}

}