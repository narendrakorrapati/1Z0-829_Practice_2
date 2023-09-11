package data;

public class MethodCall {

	public static void main(String args[]) {
	
		int number = 5;
		add5(number);
		System.out.println(number); //5
		
		String name = new String("Hello");
		addHow(name);
		System.out.println(name); //Hello
		
		StringBuilder sb = new StringBuilder("Hello");
		addHow(sb);
		System.out.println(sb); //Hello How are you?
	}

	static void add5(int number) {
		number = number + 5;
	
	}
	
	static void addHow(String name) {
		
		name = name + " How are you?";
	
	}
	
	static void addHow(StringBuilder name) {
		
		name.append(" How are you?");
	}

}