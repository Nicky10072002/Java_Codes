package pack1;

import java.util.Stack;

public class BinaryRepresentation {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		int a = 17;
		while(a!=0)
		{
			int rem = a%2;
			st.push(rem);
			a = a/2;
		}
		
		String binary=" ";
		while(!st.empty()) {
			binary = binary + st.pop();
		}
		
		System.out.println(binary);
	}
}
