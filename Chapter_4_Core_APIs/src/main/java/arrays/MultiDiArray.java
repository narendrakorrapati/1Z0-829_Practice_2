package arrays;

public class MultiDiArray{


	public static void main(String... args) {
		
		int numbers[][] = new int[3][2];
		int numbers1[][] = new int[][] {{1, 2}, {3, 4}, {5, 6}};
		int numbers2[][] = {{3}, {1, 2}, {5, 6, 7}};
		int numbers3[][] = new int[2][];
		
		numbers3[0] = new int[]{1, 2};
		numbers3[1] = new int[3];
		numbers3[1][0] = 1;
		numbers3[1][1] = 2;
		numbers3[1][2] = 3;
	}

}