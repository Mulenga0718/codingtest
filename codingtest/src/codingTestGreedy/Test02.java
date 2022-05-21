package codingTestGreedy;

import java.util.ArrayList;
import java.util.Random;

public class Test02 {
	static ArrayList<Integer> num;
	
	static void change(String s) {
		switch(s) {
		case "0": num.add(0); break;  
		case "1": num.add(1); break;  
		case "2": num.add(2); break;  
		case "3": num.add(3); break;  
		case "4": num.add(4); break;  
		case "5": num.add(5); break;  
		case "6": num.add(6); break;  
		case "7": num.add(7); break;  
		case "8": num.add(8); break;  
		case "9": num.add(9); break;  
		}
	}
	
	public static void main(String[] args) {
	Random ran = new Random();
		
	int n = ran.nextInt(20)+1;
	
	num = new ArrayList<Integer>();
	
	String[] s = new String[n];
	for(int i=0; i<n; i++) {
		s[i]= ran.nextInt(10)+"";
		change(s[i]);
		System.out.print(s[i]);
	}

	for(int i=1; i<n; i++) {
	  if(num.get(i-1)+num.get(i) >num.get(i-1)*num.get(i)) {
		  num.set(i, num.get(i-1)+num.get(i));
	  }else {
		  num.set(i, num.get(i-1)*num.get(i));
	  }
	}
	System.out.println();
	System.out.println(num.get(n-1));

	}
}
