package pack1;

import java.util.Arrays;

//1. temp = x
//	 x=y
//	 y = temp

//2. x = x+y 
//	 y = x-y 
//	 x = x-y

//3. x = x*y
//	 y = x/y
//	 x = x/y

//4. x = x^y
//	 y = x^y
//	 x = x^y

//5. x = y-x+(y=x)



public class Sort {
	public static void SortArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {  			//current value
				if(a[i]>a[j]) {
					a[i] = a[j] - a[i] + ( a[j] = a[i] );
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {5,2,8,9,4,3,10};
		SortArray(a);
		System.out.println(Arrays.toString(a));
	}
}
