package test;

public class Chick {

	private String name = "narendra";
	
	{
		System.out.println("instance initializer, name is:" + name);
		//System.out.println(name2);
		name2 = "maha";
		//name = name + " " + name2; illeagal forward reference
		name = name + " " + this.name2; //Ok to refer using this or Class name incase of static fields. No illegal forward reference error.
	}
	
	private String name2;
	
	public Chick() {
		//name = "korrapati";
		System.out.println("Constructor completed");
	}
	
	public static void main(String... args) {
		
		Chick chick = new Chick();
		System.out.println("name:"+ chick.name);		
	}
	
}