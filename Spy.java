package pack1;
import java.util.*;
public class Spy {
	
	public static void CheckSpy(int num) {
		int sum = 0;
		int pro = 1;
		while(num>0) {
			int last = num%10;
			sum += last;
			pro *= last;
			num /= 10;
		}
		String res = (sum == pro) ? "Spy Number" : "Not Spy Number";
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		CheckSpy(num);
	}
}
