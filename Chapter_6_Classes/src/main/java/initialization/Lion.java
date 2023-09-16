package overriding;

class Animal {
	
	protected getAverageWeight() {
		
		return 50;
	}

}


public class Lion extends Animal{

	public getAverageWeight() {
		
		super.getAverageWeight() + 10;
	}
	
	public static void main(String args[]) {
		
		var lion = new Lion();
		System.out.println(lion.getAverageWeight()); //60
		
		var animal = new Animal();
		System.out.println(animal.getAverageWeight()); //50
	}

}