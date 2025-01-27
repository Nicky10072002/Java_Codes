package pack1;

import java.util.HashSet;

public class DuplicateHashset {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		String s = "big black bag is sitting on big black noise of big black dog";
		String[] str = s.split(" ");
		for(int i =0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		System.out.println(hs);
	}
}
