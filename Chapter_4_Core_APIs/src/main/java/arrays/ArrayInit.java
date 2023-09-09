package arrays;

public class ArrayInit {

	public static void main(String args[]) {
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[] {1, 2, 3};
		int[] numbers3 = {1, 2, 3};
		
		int[] animals1;
		int animals2[];
		int []animals3[];
		int [] animals4;
		int animals5 [];
		
		String[] names = {"narendra", "maha"};
		String[] alias = names;
		
		System.out.println(names.equals(alias));
		System.out.println(names);
		
		Object objNames[] = names;
		String[] origNames = (String[])objNames;
		
		objNames[0] = new StringBuilder();
		
	}

}