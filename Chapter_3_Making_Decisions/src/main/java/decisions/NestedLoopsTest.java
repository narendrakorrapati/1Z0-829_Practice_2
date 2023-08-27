package decisions;

public class NestedLoopsTest {

	public static void main(String args[]) {
		
		nestedForwardForLoop();
		System.out.println();
		nestedBackwardForLoop();
		System.out.println();
		findInMatrixForward();
		findInMatrixBackward();
	}
	
	static void nestedForwardForLoop() {
		
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		
		OUTER_LOOP:
		for(int i=0; i<myComplexArray.length; i++) {
			INNER_LOOP:
			for(int j=0; j<myComplexArray[i].length; j++) {
				System.out.print(myComplexArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	static void nestedBackwardForLoop() {
		
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP:
		for(int i=myComplexArray.length-1; i>=0; i--) {
			INNER_LOOP:
			for(int j=myComplexArray[i].length-1; j>=0; j--) {
				System.out.print(myComplexArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void findInMatrixForward() {
		
		int[][] list = {{1,13},{5,2},{2,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		
		PARENT_LOOP:
		for(int i=0; i<list.length; i++) {
			
			for(int j=0; j<list[i].length; j++) {
				
				if(list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		
		if(positionX == -1 && positionY == -1) {
			System.out.println("Search value " + searchValue + " Does not found in matrix");
		} else {
			System.out.println("Search value " + searchValue + " Found at position " + positionX + "," + positionY);
		}
		
	}
	
	static void findInMatrixBackward() {
		
		int[][] list = {{1,13},{5,2},{2,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP:
		for(int i=list.length-1; i>=0; i--) {
			
			for(int j=list[i].length-1; j>=0; j--) {
				if(list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		if(positionX == -1 && positionY == -1) {
			System.out.println("Search value " + searchValue + " Does not found in matrix");
		} else {
			System.out.println("Search value " + searchValue + " Found at position " + positionX + "," + positionY);
		}
	}
}