package decisions;

public class WhileLoopTest {

	public static void main (String args[]) {
		
		//simpleWhileLoop();
		//simpleDoWhileLoop();
		printArray();
		printArrayReverse();
		
	}
	
	static void simpleWhileLoop() {
		
		int number = 11;
		
		while(number > 1) {
			
			System.out.println(--number);
		}
		
	}
	
	static void simpleDoWhileLoop() {
		
		int number = 0;
		do {
			System.out.println(++number);
		}
		while(number < 10);
	}
	
	static void printArray() {
		
		int[] array = {1, 2, 3, 4, 5};
		
		int i = 0;
		while(i < array.length) {
			System.out.println(array[i++]);
		}
		
	}
	
	static void printArrayReverse() {
		
		int[] array = {1, 2, 3, 4, 5};
		
		int i = array.length;
		
		/*
		i = 5; 5 > 0; array[4] i = 4
		i = 4; 4 > 0; array[3] i = 3
		i = 3; 3 > 0; array[2] i = 2
		i = 2; 2 > 0; array[1] i = 1
		i = 1; 1 > 0; array[0] i = 0
		i = 0; 0 > 0; Terminate
		*/
		
		while(i > 0) {
			System.out.println(array[--i]);
			
		}
		
	}

}