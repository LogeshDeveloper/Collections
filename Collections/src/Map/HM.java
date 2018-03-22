package Map;

import java.util.HashMap;

public class HM {

	public static void main(String[] args) {
		HashMap a = new HashMap();
		a.put(100,"java:");
		a.put(101,"J2EE");
		a.put(102,"J2SE");
		System.out.println(a.get(100));
		System.out.println(a.get(101));
		System.out.println(a.get(102));
		
	}

}
