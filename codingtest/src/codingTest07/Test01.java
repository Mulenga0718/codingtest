package codingTest07;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long cost;
		long income = c-b;
		if(b>=c) {
			System.out.println("-1");
			return;
		}
		long result = (long) (Math.ceil(a / income)+1);
		System.out.println(result);
	}
}
