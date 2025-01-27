package pack1;

import java.util.HashSet;

public class FirstRepeatedChar {
	public static void main(String[] args) {
		String s = "abrtyrwuvab";
		HashSet<Character> hs= new HashSet<Character>();
		
		for(int i =0;i<s.length();i++)
		{
			if(!hs.add(s.charAt(i))) {
				System.out.println("First Repeated Character is : " + s.charAt(i));
				return;
			}
		}
	}
}
