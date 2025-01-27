package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ConvertreverseLinkedList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("ABC");
		al.add('A');
		al.add(10.8f);
		
		LinkedList list = new LinkedList(al);
		Iterator i = list.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
