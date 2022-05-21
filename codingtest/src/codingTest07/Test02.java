package codingTest07;

import java.util.Scanner;

public class Test02 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			long n = sc.nextInt();
			int count = 0;
			int hexa = 1;
			while(true) {
				hexa += (6*count); 
				
				if(n <= hexa) {
					System.out.println(count+1);
					return;
				}
				count++;
			}
			
		}
}
