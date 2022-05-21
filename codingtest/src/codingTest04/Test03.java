package codingTest04;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int n = ran.nextInt(10)+1;
		System.out.println(n);
		int a[] = new int[n];
		int b[] = new int[n];
		
	
		for(int i=0; i<n; i++ ) {
			a[i] = ran.nextInt(10000000);
			b[i] = ran.nextInt(10000000);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		for(int i=0; i<n; i++) {
			 Arrays.sort(a);
			 Arrays.sort(b);
			if(b[n-1] >a[0]) {
			int temp = a[0];
			a[0] = b[n-1];
			b[n-1] = temp;
			}else {break;}
	}
		
		int sum = 0;
		for(int sumnum : a) {
			sum += sumnum;
		}
	
	System.out.println(Arrays.toString(a));
	System.out.println(sum);
	}
}


