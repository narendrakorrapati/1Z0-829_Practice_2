package strings;

public class StringTest {


	public static void main(String args[]) {
		
		createStrings();
		stringCharAt();
		stringIndexOf();
		stringSubString();
		adjustCase();
		searchingString();
		replacingValues();
		translateEscapes();
		emptyAndBlank();
		formating();
	}
	
	static void createStrings() {
		
		String s1 = "narendra";
		String s2 = new String("narendra");
		String s3 = """
					narendra""";
					
		System.out.println(s1.equals(s2)); //true
		System.out.println(s2.equals(s3)); //true
		System.out.println(s1 == s2); //false
		System.out.println(s2 == s3); //false
		System.out.println(s1 == s3); //true
		
	}
	
	static void stringCharAt() {
		String s = "Narendra Korrapati";
		System.out.println(s.charAt(8));
		System.out.println(s.charAt(9));
		
	}
	
	static void stringIndexOf() {
		String s = "Narendra Korrapati";
		System.out.println(s.indexOf(" "));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf("e"));
		System.out.println(s.indexOf('a', 14)); 
		System.out.println(s.indexOf("ap", 13)); 
	}

	static void stringSubString() {
		String s = "Narendra Korrapati";
		System.out.println(s.substring(0, 8));
		System.out.println(s.substring(9));
		System.out.println(s.substring(s.indexOf('K')));
	}
	
	static void adjustCase() {
		String s = "Narendra Korrapati";
		System.out.println(s.substring(s.indexOf(s.charAt(0)), 8).toUpperCase());
	}
	
	static void searchingString() {
		String s = "Narendra Korrapati";
		System.out.println(s.startsWith("Na"));
		System.out.println(s.endsWith("pati"));
		System.out.println(s.contains(" "));
	}
	
	static void replacingValues() {
		
		String s = "Narendra Korrapati";
		System.out.println(s.replace('N', 'M'));
		System.out.println(s.replace("Na", "Su"));
	}
	
	static void translateEscapes() {
		String s = "Narendra \\t Korrapati";
		System.out.println(s);
		System.out.println(s.translateEscapes());
	}

	static void emptyAndBlank() {
		
		System.out.println(" ".isEmpty()); //false
		System.out.println("".isEmpty());//true
		System.out.println(" ".isBlank());//true
		System.out.println("".isBlank());//true
	}
	
	static void formating() {
		var name = "Kate";
		var orderId = 5;
		// All print: Hello Kate, order 5 is ready
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println(String.format("Hello %s, order %d is ready",
		name, orderId));
		System.out.println("Hello %s, order %d is ready"
		.formatted(name, orderId));
		
	}
}