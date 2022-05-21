package codingTest06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("식량의 개수 : ");
		int n = Integer.parseInt(sc.nextLine());
		int meal[] = new int[n];
		for (int i = 0; i < n; i++) {
			meal[i] = ran.nextInt(1000) + 1;
		}
		System.out.println(Arrays.toString(meal));
	
	ArrayList<Integer> save1 = new ArrayList<Integer>();	
	ArrayList<Integer> save2 = new ArrayList<Integer>();	
	for(int i=0; i<n; i++) {	
		if(n-i <4) {
			save1.add(meal[i]);
			i++;
		}else {
		if(meal[i]+meal[i+2] > meal[i+3]) {
		save1.add(meal[i]);
		save1.add(meal[i+2]);
		i= i+3;
		}
		else if(meal[i]+meal[i+2] < meal[i+3]) {
		save1.add(meal[i+1]);
		save1.add(meal[i+3]);
		i = i+4;
		}
		}
	}	
	for(int i=1; i<n; i++) {	
		if(n-i <4) {
			save2.add(meal[i]);
			i++;
		}else {
		if(meal[i]+meal[i+2] >= meal[i+3]) {
		save2.add(meal[i]);
		save2.add(meal[i+2]);
		i= i+3;
		}
		else if(meal[i]+meal[i+2] < meal[i+3]) {
		save2.add(meal[i+1]);
		save2.add(meal[i+3]);
		i = i+4;
		}
		}
	}	
	int sum1 =0;
	for(int a : save1) {
		sum1 +=a;
	}
	int sum2 =0;
	for(int b: save2) {
		sum2 +=b;
	}
	System.out.println(save1);
	System.out.println(save2);
	
	if(sum1>sum2) {
		System.out.println(save1);
	}else {
		System.out.println(save2);
	}
	}
}

