package pack1;

import java.util.Stack;

public class RemoveAdjacentDuplicate {
	public static void Adjacent(String s) {
		Stack<Character> st = new Stack<Character>();
		for(char c : s.toCharArray()) {
			if(st.isEmpty()) {
				st.push(c);
			}
			if(!st.isEmpty() && st.peek()==c) {
				st.pop();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println();
	}
}
