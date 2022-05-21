package codingTest06;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int x = ran.nextInt(30000);
		int count=0;
		System.out.println("x값 : "+x);
		while(x != 1) {
		if(x%5==0) {
			x = x/5;
			count++;
		}else if(x%3 == 0) {
			x = x/3;
			count++;
		}else if(x%2 == 0) {
			x = x/2;
			count++;
		}else {
			x -= 1;
			count ++;
		}
		}
		System.out.println("x값 : "+x);
		System.out.println("카운트: " + count);
		
	}
}
