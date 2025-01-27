package pack1;

import java.util.Scanner;

public class Armstrong {
	public static double count(int n) {
		int c = 0;
		while(n>0) {
			int rem = n%10;
			c++;
			n = n/10;
		}
		System.out.println(c);
		return c;
	}
	public static void Check(int num) {
		int copy = num;
		double sum = 0;
		while(num>0) {
			int rem = num%10;
			sum = sum + Math.pow(num, count(num));
			num=num/10;
		}
		if(sum==copy)
		{
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		Check(n);
	}
}
