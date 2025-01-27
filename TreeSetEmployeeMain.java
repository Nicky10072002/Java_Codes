package pack1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEmployeeMain {
	public static void main(String[] args) {
		
		TreeSet<TreeSetEmployee> ts = new TreeSet<TreeSetEmployee>(Comparator.reverseOrder());
		
		ts.add(new TreeSetEmployee("Ankita", 1, 25000d));
		ts.add(new TreeSetEmployee("Arijit", 2, 55000d));
		ts.add(new TreeSetEmployee("Sayan", 3, 150000d));
		ts.add(new TreeSetEmployee("Soumi", 4, 25001d));
		ts.add(new TreeSetEmployee("chitraArka", 10, 2500090d));
		ts.add(new TreeSetEmployee("Chitra", 12, 5500000d));
		ts.add(new TreeSetEmployee("Sayan", 13, 1500008d));
		ts.add(new TreeSetEmployee("Rishav", 14, 250005d));
		
		
		Iterator<TreeSetEmployee> tree = ts.iterator();
		
		
		while(tree.hasNext()) {
			System.out.println(tree.next());
		}
		
//		for(TreeSetEmployee t:ts) {
//			System.out.println(t);
//		}
	}
}