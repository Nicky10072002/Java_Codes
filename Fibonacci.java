package pack1;
import java.util.*;

public class Fibonacci {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		printfibonacci(n);
	}
	
	public static void printfibonacci(int count) {
		int n0 = 0;
		int n1 = 1;
		System.out.println(" " + n0);
		System.out.println(" " + n1);
		for(int i=3;i<=count;i++)
		{
			int n2 = n0+n1;
			System.out.println(" " + n2);
			n0=n1;
			n1=n2;
		}
	}
	
}
