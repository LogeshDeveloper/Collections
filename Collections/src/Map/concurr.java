package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class concurr {

	public static void main(String[] args) {
		ConcurrentHashMap a = new ConcurrentHashMap();
		a.put(100, "JAVA");
		a.put(101, "J2EE");
		a.put(102, "J2SE");

		Iterator i = a.entrySet().iterator();

		while (i.hasNext()) {

			Map.Entry meObj = (Entry) i.next();

			System.out.println(meObj.getKey());
			System.out.println(meObj.getValue());
			
			System.out.println("--------------");

		}

	}

}
