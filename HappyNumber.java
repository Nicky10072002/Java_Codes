package pack1;

import java.util.Scanner;

public class HappyNumber {
	public static void number(int num) 
	{
		int sum = 0;
		int sq = 0;
		while(num>0) 
		{
			int rem = num%10;
			sq = rem*rem;
			sum = sum+sq;
			num = num/10;
		}
		if(sum >= 10)
		{
			number(sum);
		}
		else 
		{
			if(sum==1)
			{
				System.out.println("Happy number");
			}
			
			else if(sum==4){
				System.out.println("Not Happy Number");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		number(n);
	}
}


