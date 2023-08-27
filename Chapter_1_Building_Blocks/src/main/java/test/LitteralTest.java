package test;

public class LitteralTest {

	//long l = 222334333434; //By default integral litterals are considered as int types. In this case number 222334333434 exceeds the int range hence compile error;
	long l = 222334333434L; //Tells compiler that the litteral is of type Long
	
	//Octal
	int oct1 = 017;
	long oct2 = 032;

	//Hexa 0-9 and A-F/a-f
	int hex1 = 0x12Af;
	long hex2 = 0xAb1243433L;
	
	//binary
	int binary1 = 0B101010101;
	long binary2 = 0b010101111;
	
	//Underscores
	int million = 1000000;
	int million1 = 1__000_000;
	
	double million2 = 1_000_000.0_0;
	
	float f1 = 10290L;
	
	Short short1 = Short.valueOf("1");
	short short2 = Short.parseShort("1");
	
	Integer int1 = Integer.parseInt("10"); //autobox
	int int2 = Integer.valueOf("10"); //unbox
	
	String textBlock = """
			"Java Study Guide"
			 by Scott & Jeanne""";
	
	  
	public static void main(String args[]) {

		LitteralTest test = new LitteralTest();
		System.out.print(test.textBlock);
		
	}		

}