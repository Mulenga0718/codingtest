package codingTest02;

import java.util.Random;

public class Test02 {
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int second = 0;
		int min =0;
		int hour = 0; 
		int count = 0; 
		int by = 5;//ran.nextInt(24);
		while(hour <= by) {
			second++;
			if(second >=60) {
				second = 0; min++;
			}
			if(min >= 60) {
				min =0; hour++;
			}
			
			if(hour%10 == 3) {
				count++;
			}else if(min%10 ==3 || min/10 == 3) {
				count++;
			}else if(second%10 ==3 || second/10 == 3) {
				count++;
			}
		}
		
		System.out.println("횟수 : "+count);
		
	}
}
