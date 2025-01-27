package pack1;

import java.util.Scanner;

public class Perfectsqrt {
	public static void pvtSQRT(int num) {
		boolean flag = true;

		for (int i = 1; i <= num; i++) {
			int sq = i * i;

			if (sq == num) {
				System.out.println("Perfect Square");
				flag = false;
				break;
			}

		}
		if (flag == true) {
			System.out.println("Not Perfect Square");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		pvtSQRT(n);
	}
}
