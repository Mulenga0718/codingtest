package codingTest07;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int n = sc.nextInt();
		int num = 0;
		int count = 1;
		while (flag) {
			num += count;
			if (n <= num) {
				flag = false;
			} else {
				count++;
			}
		}
		
		int minus = fact(count);
		int rest =  n - minus;
		int num1 = 1;
		int num2 = 1;
		
		if(count %2 ==0) {
			num2 =count;
			num1 += rest-1;
			num2 -= rest-1;
		}else {
			num1 = count;
			num1 -= rest-1;
			num2 += rest-1;
		}
		System.out.println(num1 +"/"+num2);
		}
	
	public static int fact(int count) {
		int sum =0;
		
		for(int i =count-1; i>=1; i--) {
			sum += i;
		}
		return sum; 
	}

	}
