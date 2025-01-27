package pack1;

public class Prorecursion {
	public static int product(int num) {
		if(num==0) {
			return 1; 
		}
		return (num%10 * product(num/10));
	}
	public static void main(String[] args) {
		int res = product(36);
		System.out.println(res);
	}
}
