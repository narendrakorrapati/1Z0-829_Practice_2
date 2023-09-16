package constructors;

public class OverloadConstruct extends SuperClass{


	public OverloadConstruct() {
		super(5);
		System.out.println("No arg construct");
	}
	
	public OverloadConstruct(int number) {
		this();
		System.out.println("int arg construct");
	}
	

	public static void main(String args []) {
		
		var olc = new OverloadConstruct(5);
		
	}

}

class SuperClass {
	
	/*
	public SuperClass() {
		
		System.out.println("Super No arg construct");
	}*/
	
	public SuperClass(int number) {
		
		System.out.println("Super int arg construct");
	}
	
}