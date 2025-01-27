package pack1;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int num = sc.nextInt();
		printLeapyear(num);
	}
	
	public static void printLeapyear(int num) {
		if(num%4==0 && ((num%400==0) || (num%100!=0)))
		{
			System.out.println("LEAP YEAR!!!");
		}
		else
		{
			System.out.println("NOT LEAP YEAR!!!");
		}
	} 
	
}
