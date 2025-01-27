package pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("ABC");
		al.add('A');
		al.add("BUS");
		al.add(15.5f);
		al.add(123);
		al.add(5);
		
		System.out.println("Print all intergers: ");
		for(Object o : al) {
			if(o instanceof Integer) {
				System.out.println(o);
			}
		}
		System.out.println("Print all characters: ");
		for(Object o : al) {
			if(o instanceof Character) {
				System.out.println(o);
			}
		}
		System.out.println("Print all strings starts from 'A' : ");
		for(Object o : al) {
			if(o instanceof String) {
				String s = (String) o;
				if(s.startsWith("A") || s.startsWith("a")) {
					System.out.println(s);
				}
			}
		}
		System.out.println("Print all strings ends with 'S' : ");
		{
			for(Object o : al) {
				if(o instanceof String) {
					String s = (String) o;
					if(s.endsWith("S") || s.endsWith("s")) {
						System.out.println(s);
					}
				}
			}
		}
	}
}
