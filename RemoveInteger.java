package pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveInteger {
	public static void main(String[] args) {
		ArrayList  al = new ArrayList();
		al.add(10);
		al.add("ABC");
		al.add(1.2f);
		al.add("Virat");
		al.add(false);
		al.add('c');
		al.add(18522000);
		al.add(178);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			if(o instanceof Integer) {
				i.remove();
				System.out.println(i);
			}
		}
		for(Object o : al) {
			System.out.println(o);
		}
	}
}
