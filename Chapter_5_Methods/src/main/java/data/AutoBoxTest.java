package data;


public class AutoBoxTest {

	public void climb(long t) {}
	public void swing(Integer u) {}
	public void jump(int v) {}
	
	public static void main(String[] args) {
		var c = new AutoBoxTest();
		c.climb(123);
		c.climb(Integer.valueOf(123));
		c.swing(123);
		//c.jump(123L); // DOES NOT COMPILE
	}

}



class AutoBoxTest1 {

	public void climb(Long t) {}
	public void swing(Integer u) {}
	public void jump(int v) {}
	
	public static void main(String[] args) {
		var c = new AutoBoxTest1();
		//c.climb(123); // DOES NOT COMPILE. Either autobox or implicit cast applies not both at the same time.
		//c.climb(Integer.valueOf(123)); // DOES NOT COMPILE
		c.swing(123);
	}

}