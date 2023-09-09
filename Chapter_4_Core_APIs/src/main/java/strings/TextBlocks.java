package strings;

public class TextBlocks {

	public static void main(String args[]) {
	
		String s = """
				   Narendra   
				 Korrapati
				  Software""";
		
		System.out.println(s.length());
		System.out.print(s.indent(1));
		System.out.print(s.stripIndent());
		
	}

}