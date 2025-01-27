package pack1;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(null);
		hs.add(2);
		hs.add('e');
		hs.add(10);
		hs.add("ABC");
		System.out.println(hs);
	}
}
