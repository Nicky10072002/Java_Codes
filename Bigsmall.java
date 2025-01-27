package pack1;
import java.util.*;
public class Bigsmall {
	
	public static boolean Check(int b,int s,int g) {
		int big = 5;
		int small = 1;
		int total_big = big*b;
		int total_small = small*s;
		while(g<total_big) {
			total_big -= big;
		}
		int required = g-total_big;
		if(required <= total_small) {
			return true;	
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Big bricks required :" );
		int b = sc.nextInt();
		System.out.println("Enter Small bricks required :" );
		int s = sc.nextInt();
		System.out.println("Enter goal number :" );
		int g = sc.nextInt();
		System.out.println(Check( b,s, g));
	}
}
