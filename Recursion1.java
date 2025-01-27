package pack1;


//print 1 to 10

public class Recursion1 {
	public static void print(int num) {
		if(num<1) {
			return;
		}
		System.out.println(num);
		print(num-1);
		System.out.println("ABC");
	}
	public static void main(String[] args) {
		print(10);
	}
}
