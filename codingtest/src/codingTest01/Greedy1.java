package codingTest01;

import java.util.Scanner;

public class Greedy1 {

	public static void main(String[] args) {
		//거스름돈 최소한의 동전 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("잔돈을 입력하세요. > ");
		int balance = Integer.parseInt(sc.nextLine());
		
		int a;
		int b;
		int c;
		int d;
		int count=0;
		a =	balance / 500; 
		balance = balance % 500;
		b = balance / 100;
		balance = balance % 100;
		c = balance / 50;
		balance = balance % 50;
		d = balance / 10;
		balance = balance % 10;
		
		System.out.println("잔돈: 500원 :"+a+"개 100원 : "+b + "개 50원 : "+ c+ "개 10원 : "+d );
	}

}
