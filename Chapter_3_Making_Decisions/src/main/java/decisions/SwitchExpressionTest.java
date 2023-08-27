package decisions;

public class SwitchExpressionTest {

	public static void main(String args[]) {
		
		switchExpressionWithReturn(1);
		switchExpressionWithoutReturn(1);
		switchExpressionWithReturnAndBlock(1);
		switchExpressionWithoutReturnAndBlock(1);
		getFish("narendra");
		
	}
	
	static void getFish(Object fish) {
		if (!(fish instanceof String guppy))
			System.out.print("Eat!");
		else if (!(fish instanceof String guppy)) {
			throw new RuntimeException();
		}
		System.out.print("Swim!");
	}
	
	static void switchExpressionWithReturn (int expression) {
		
		int result = switch(expression) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			default -> 100; //It is needed to cover all possible values
		}; //Semicolon is need for Switch expression
		System.out.println(result);
	}
	
	static void switchExpressionWithoutReturn(int expression) {
		
		switch(expression) {
			case 1 -> System.out.println(10);
			case 2 -> System.out.println(20);
			case 3 -> System.out.println(30);
			//default -> System.out.println(100); It is optional incase not returning anything or returns something but covers all possible values
		}
	}

	static void switchExpressionWithReturnAndBlock(int expression) {
		
		int result = switch(expression) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> {
				yield 30;
			}
			default -> {
				yield 100;
			}
		};
		System.out.println(result);
	}
	
	static void switchExpressionWithoutReturnAndBlock(int expression) {
		
		switch(expression) {
			case 1 -> {
				System.out.println(10);
				break;
			}
			case 2 -> {
				System.out.println(20);
			}
			case 3 -> {
				System.out.println(30);
			}
			default -> {
				System.out.println(100);
			}
		}
	}
	
}