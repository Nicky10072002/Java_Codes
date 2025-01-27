package pack1;

import java.util.Stack;

public class ReverseStringStack {
	public static void main(String[] args) {
		Stack st = new Stack();
		String a = "ABC";
		String s = " ";
		for(int i =0;i< a.length();i++) {
			st.push(a.charAt(i));
		}
		while(!st.isEmpty())
		{
			s = s + st.pop();
		}
		System.out.println(s);
	}
}
