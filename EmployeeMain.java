package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> hs = new ArrayList<Employee>();
		
		hs.add(new Employee("Ankita", 1, 25000d));
		hs.add(new Employee("Arijit", 2, 55000d));
		hs.add(new Employee("Sayan", 3, 150000d));
		hs.add(new Employee("Soumi", 4, 25000d));
		hs.add(new Employee("chitraArka", 10, 2500090d));
		hs.add(new Employee("Chitra", 12, 5500000d));
		hs.add(new Employee("Sayan", 13, 1500008d));
		hs.add(new Employee("Rishav", 14, 250005d));
		hs.add(new Employee("Soumalya", 21, 250008d));
		hs.add(new Employee("Arunabha", 22, 550007d));
		hs.add(new Employee("Sujal", 23, 1500007d));
		hs.add(new Employee("Megha", 64, 2500077d));
		
		
		for(Employee e : hs) {
			System.out.println(e);
		}
		
		
		
		Collections.sort(hs);
		System.out.println("----------------------------------------------");
		
		for(Employee e : hs) {
			System.out.println(e);
		}
	}
}

