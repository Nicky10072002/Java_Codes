package pack1;

import java.util.Scanner;

public class StrongnumberMtoN {
	public static void CheckStrongMtoN(int num) {
		int temp = num;
		int rem=0;
		int sum = 0;
		while(num!=0) {
			rem = num%10;
			sum = sum+fact(rem);
			num = num/10;
		}
		if(sum == temp) {
			System.out.println( sum + " " +"Strong number!!!");
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
		System.out.println("Enter a first range number : ");
		int m = sc.nextInt();
		System.out.println("Enter a last range number : ");
		int n = sc.nextInt();
		
		for(int i = m;i<=n;i++) {
		
		CheckStrongMtoN(i);
	}
}
}
