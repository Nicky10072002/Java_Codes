package pack1;
import java.util.*;
public class Reversenum {
	public static void CheckReverse(int num) {
		int sum = 0;
		while(num>0)
		{
			int last = num%10;
			sum = (sum*10)+last;
			num /= 10;
		}
		System.out.println("Reverse number is : " + sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		CheckReverse(num);
	}
}
