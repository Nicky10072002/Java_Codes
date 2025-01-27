package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashsetSort {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
//		hs.add(10);
//		hs.add(8);
//		hs.add(-1);
//		hs.add(9);
//		hs.add(1);
//		hs.add(1000);
		
		hs.add("Sheela");
		hs.add("Soumi");
		hs.add("Ankita");
		hs.add("Arka");
		hs.add("Souvik");
		
		for(Object o : hs) {
			System.out.println(o);
		}
		
		ArrayList<String> al = new ArrayList<String>(hs);
		Collections.sort(al);
		System.out.println(al);
	}
}
