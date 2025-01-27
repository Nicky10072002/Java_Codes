
//wap to check for valid parenthesis

package pack1;

import java.util.Stack;

public class Parenthesis {
	
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
				st.push(c);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				else {
					char popped = st.pop();
					if(popped == '(' && (c== '}' || c== ']' ) ) 
					{
						return false;
					}
					if(popped == '{' && (c== ')' || c== ']')) {
						return false;
					}
					if(popped == '[' && (c== ')' || c== '}')) {
						return false;
					}
				}
			}
		}
		return st.isEmpty();
	}
	
	public static void main(String[] args) {
		
		System.out.println(isValid("[]{}()"));
		
	}
}
