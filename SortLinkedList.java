package pack1;

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(18);
		list.add(100);
		list.add(1);
		list.add(-8);
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("-----------------");
		
		Collections.sort(list);
		for(Object o : list) {
			System.out.println(o);
		}
	}
}
