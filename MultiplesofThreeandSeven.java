package pack1;

public class MultiplesofThreeandSeven {
	public static void CheckMultiply(int num) {
		if(num>50) {
			return;			//base condition
		}
		
		if(num%3==0 && num%7==0) {			//printing condition
			System.out.println(num);
		}
		CheckMultiply(num+1);
	}
	public static void main(String[] args) {
		CheckMultiply(5);
	}
}
