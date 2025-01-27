package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArryayListSort {
	public static void sortList(List<Integer> list) {
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j))
				{
					 Integer temp = list.get(i);
					 list.set(i, list.get(j));
					 list.set(j, temp);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(7);
		al.add(5);
		al.add(20);
		
		sortList(al);
		System.out.println(al);
	}
}
