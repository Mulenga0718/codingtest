package codingTest05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int n = 4; //Integer.parseInt(sc.nextLine());
		int m = 6; //Integer.parseInt(sc.nextLine());
		
		int num[] = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i]= ran.nextInt(20)+1;
		}
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		int max = num[n-1];
		
		 int length = 0;
		for(int i=max; i>0; i--) {
			int sum= 0;
			for(int j=0; j<n;j++) {
				if(num[j]-i >0) {
				sum += num[j]-i;}
			}
			if(sum >= m) {length = i; break;
		}
		
		}
		System.out.println("길이: "+length);
}
}
