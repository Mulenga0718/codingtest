package codingTest01;

import java.util.Random;

public class Greedy4 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int n =  ran.nextInt(99999)+2;
		int k =  ran.nextInt(n)+1;
		System.out.println("n 값: " + n);
		System.out.println("k 값: " + k);
		
		int count =0;
		while(n != 1) {
			if(n%k ==0) {
				n= n/k; count++; 
			}
			else {n -=1; count++;}
		}
		
		System.out.println("최소 횟수값 : "+count);
	}
}
