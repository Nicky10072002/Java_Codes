package pack1;

import java.util.Scanner;

public class Strongnumber {
	public static void checkstrong(int num) {
		int temp = num;
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			int fact = fact(rem);
			sum = sum + fact;
			num/=10;
		}
		if(sum == temp) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
	}
	public static int fact(int n) {
		int pro = 1;
		for(int i=1;i<=n;i++) {
			pro = pro*i;
		}
		return pro;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		checkstrong(num);
		
	}
}
