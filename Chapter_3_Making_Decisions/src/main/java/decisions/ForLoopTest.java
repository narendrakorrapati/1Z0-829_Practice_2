package decisions;

public class ForLoopTest{

	public static void main(String args[]) {
		
		forwardForLoop(10);
		System.out.println();
		backwardForLoop(10);
	}
	
	static void forwardForLoop(int target) {
		
		for(int i=1; i<=target; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	static void backwardForLoop(int target) {
		
		for(int i=target; i>=1; --i) {
			System.out.print(i + " ");
		}
		
	}

}