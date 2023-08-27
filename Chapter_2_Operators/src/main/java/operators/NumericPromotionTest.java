package operators;

public class NumericPromotionTest {

	public static void main(String... args) {
	
		int x = 3;
		long y = 10;
		var result = 3 * 10;
		
		
		//float egg = 2.0/9; Does not compile
		
		int fish = (int)9.0;
		short bird = (short)1921222; //Sotred as 20678 due to overflow
		int mammal = (int) 9f;
		//long reptile = (long)192301398193810323; // DOES NOT COMPILE
		long reptile = 192301398193810323L;
		
		byte hat = 1;
		byte gloves = 7 * 10;
		short scarf = 5;
		short boots = 2 + 1;
		
		//short boots1 = 2 + hat; //DOES NOT COMPILE
		//byte gloves1 = 7 * 100; //DOES NOT COMPILE
	}

}