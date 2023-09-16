package inheritance;


public class Lion extends Animal {

	public void setProperties(int age, String name) {
		
		this.name = name;
		setAge(age);	
	}
	
	public void roar() {
		
		System.out.print(name + ", age " + getAge() + ", says: Roar!");
	}
	
	public static void main(String [] args) {
		
		Lion lion = new Lion();
		lion.setProperties(10, "Narendra");
		lion.roar();
	}
	
}