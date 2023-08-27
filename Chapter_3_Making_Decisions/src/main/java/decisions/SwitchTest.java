package decisions;

public class SwitchTest {

	public static void main(String args[]) {
		
		combineSwitchCases();
		switchCaseAllowedVariables();
	}
	
	static void switchCaseAllowedVariables() {
		
		byte numberOfAnimals = 3;
		
		final int bananas = 1;
		final int apples = 2;
		final byte test = 3;
		
		switch(numberOfAnimals) {
			case bananas: 
			case apples:
			case 3 * 5:
			case test:
			
		}
		
	}
	
	static void combineSwitchCases() {
		
		String animal = "monkey";
		
		switch(animal) {
			case "lion":
			{
				System.out.println("Printing lion");
				System.out.println("lion second line");
				break;
			}
			case "tiger":
				System.out.println("Printing tiger");
				break;
			case "monkey", "zeebra":
				System.out.println("Mokey or Zeebra");
				break;
			default:
				System.out.println("Printing default");
			
		}
	}

}