package List;

import java.util.Vector;

public class vec {

	public static void main(String[] args) {
		
		Vector a = new Vector();
		a.add(100);
		a.add("fita");
		a.add(10.10);
		a.add(false);
		
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
		
}
}
	
	
	
