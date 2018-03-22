package List;

import java.util.ArrayList;

public class Arraylist
{
		
	public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(100);
	a.add("fita");
	a.add(10.10);
	a.add(false);
	
	for(int i=0;i<a.size();i++){
		System.out.println(a.get(i));
	}
		
	}

}
