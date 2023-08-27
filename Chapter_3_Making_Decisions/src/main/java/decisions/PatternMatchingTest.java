package decisions;

public class PatternMatchingTest {

	public static void main(String args[]) {
		
		compareIntegers(10);
		printIntegersGreaterThan5(10);
		
		Integer value = 123;
		
		if(value instanceof Integer) {
			
		}
		/* DOES NOT COMPILE: 
		The type of the pattern variable must be a subtype of the variable on the left side of the
		expression. It also cannot be the same type. This rule does not exist for traditional instanceof
		operator expressions, though.
		
		if(value instanceof Integer data) {
			
		}*/
		
	}
	
	static void compareIntegers(Number number) {
		
		if(number instanceof Integer data) {

			System.out.println(data.compareTo(5));

		}
		
	}
	
	static void printIntegersGreaterThan5(Number number) {
		
		if(number instanceof Integer data && data.compareTo(5) > 0) {
			
			System.out.println(data);
		}
	}
	
	static void printOnlyIntegers(Number number) {
		
		if(!(number instanceof Integer data)){
			return;
		}
		
		System.out.println(data.intValue());
	}
}
