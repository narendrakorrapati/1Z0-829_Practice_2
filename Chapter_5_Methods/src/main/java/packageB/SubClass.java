package packageB;

import packageA.SuperClass;

public class SubClass extends SuperClass{
	
	void superReference() {
		printText();
		System.out.println(text);
		
	}
	/*
	public static void main(String args[]) {
	
		SubClass sub = new SubClass();
		sub.superReference();
		sub.printText();
		System.out.println(sub.text);
	
	}*/

}

class SubClassTest {
	
	public static void main(String args[]) {
	
		SubClass sub = new SubClass();
		sub.superReference();
		//sub.printText(); //Not allowed for calles for SubClass. It is allowed only in the subclass
		//System.out.println(sub.text);
	
	}
	
}