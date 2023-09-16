package overriding;

class Animal {
	
	int weight = 50;
	
	protected int getAverageWeight() {
		return weight;
	}
}

public class Lion extends Animal{
	
	int weight = 10;
	
	public int getAverageWeight() {
		
		return weight;
	}
	
	public static void main(String args[]) {
		
		var lion = new Lion();
		System.out.println(lion.getAverageWeight()); //10
		
		var animal = new Animal();
		System.out.println(animal.getAverageWeight()); //50
		
		Animal animalLion = new Lion();
		System.out.println(animalLion.getAverageWeight()); //10
	}

}