package pack1;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add("Arijit");
		list.add(10.8f);
		list.add('A');
		
		for(Object o : list) {
			System.out.println(o);
		}
		Collections.reverse(list);
		System.out.println("------------");
		for(Object o : list) {
			System.out.println(o);
		}
	}
}
