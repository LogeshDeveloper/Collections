package List;

import java.util.LinkedList;

public class LLS {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add(100);
		a.add("fita");
		a.add(10.10);
		a.add(false);
		
		for(int i=0;i<a.size();i++){
	    System.out.println(a.get(i));
		}
	}

}
