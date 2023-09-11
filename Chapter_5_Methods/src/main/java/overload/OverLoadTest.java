package overload;

public class OverLoadTest {
	
	
	/*
	1. Promote premitive to find the best match (Widening). short -> byte -> int -> long -> float -> double
	2. If none of the match found, then do the autoboxing  short -> Short or int -> Integer etc but to widening
	3. If exact match of wrapper class is not found then look for its super class. int -> Integer -> Number -> Object
	4. If none of them found, follow the step 5
	5. Check for pimitive int... var args. If not found autobox to wrapper and look for Integer... -> Number... -> Object...
	6. But for varargs, only one method should present. Otherwise ambiguity. (int... or Integer... or Number... or Object...)
	   Reason for this is, java doesn't know whcich method to call when called with no arguments or with int, Integer, Number, Object all mixed	
	*/


	public static void method(short i) {
		System.out.println("method(short)");
		
	}
	/*
	public static void method(int i) {
		System.out.println("method(int)");
		
	}*/
	
	/*
	public static void method(float i) {
		System.out.println("method(float)");
		
	}*/
	
	/*
	public static void method(long i) {
		System.out.println("method(long)");
		
	}*/
	
	/*
	public static void method(double i) {
		System.out.println("method(double)");
		
	}*/
	
	/*
	public static void method(Integer i) {
		System.out.println("method(Integer)");
		
	}*/
	
	/*
	public static void method(Number i) {
		System.out.println("method(Number)");
		
	}*/
	
	/*
	public static void method(Object i) {
		System.out.println("method(Object)");
		
	}*/
	
	/*
	public static void method(int... i) {
		System.out.println("method(int...)");
		
	}*/
	
	
	public static void method(Integer... i) {
		System.out.println("method(Integer...)");
		
	}
	
	/*
	public static void method(Number... i) {
		System.out.println("method(Number...)");
		
	}*/
	
	/*
	public static void method(Object... i) {
		System.out.println("method(Object...)");
		
	}*/
	
	public static void main(String[] args) {
		
		//Number num = Integer.valueOf(20);
		
		method((short) 1);
		method(1, Integer.valueOf(10));
	}


}