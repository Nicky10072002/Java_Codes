package pack1;

public class EvenRecursion {

	public static void CheckEven(int n) {
		if(n>50) { //base condition
			return;
		}
		if(n%2 == 0) {
			System.out.println(n);
		}
		CheckEven(n+1);
		
	}
	public static void main(String[] args) {
		CheckEven(1);
	}
}
