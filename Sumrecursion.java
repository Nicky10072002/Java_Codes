package pack1;

public class Sumrecursion {
	public static int sum(int num) {
		if(num == 0) {
			return 0;
		}
		return (num%10 + sum(num/10));
	}
	public static void main(String[] args) {
		int res =sum(12345);
		System.out.println(res);
	}
}

