package operators;

public class CompoundAssignment {

	public static void main(String args[]) {
	
		int camel = 2, giraffe = 3;
		camel = camel * giraffe; // Simple assignment operator
		camel *= giraffe; // Compound assignment operator
		
		long goat = 10;
		int sheep = 5;
		//sheep = sheep * goat; // DOES NOT COMPILE
		sheep *= goat; //Compiles dule to implicit cast
		
		long long1 = 4;
		int long2 = (int)(long1 = 5);
	}

}