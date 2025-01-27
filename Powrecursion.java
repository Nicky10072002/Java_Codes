package pack1;

public class Powrecursion {
	public static int power(int x, int y) {
		if(y == 0) {
			return 1;
		}
//		return (int) (Math.pow(num, num1));
		return x * power(x,  y-1);
	}
	public static void main(String[] args) {
		int res = power(7,3);
		System.out.println(res);
	}
}
