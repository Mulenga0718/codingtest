package codingTestGreedy;

import java.util.ArrayList;
import java.util.Random;

public class Test03 {
	static ArrayList<String> s;
	static int change(String a) {
		
		
		int count =0;
		if(!s.get(s.size()-1).equals(a)) {
			count++; }
		
		for(int i=1; i<s.size(); i++) {
			if(s.get(i-1).equals(s.get(i)) ||s.get(i-1).equals(a)) {
			}else {
				count++;
			}
	    }
		return count;
	}
	public static void main(String[] args) {
		Random ran = new Random();
		s = new ArrayList<String>();
		
		int n =10;// ran.nextInt(99)+1;
		
		for(int i=0; i<n; i++) {
			s.add(ran.nextInt(2)+"");
			System.out.print(s.get(i));
		}
		System.out.println();
		int a = change("0");
		System.out.println(a);
		int b = change("1");
		System.out.println(b);
		int result = Math.min(a, b);
		System.out.println();
		System.out.println(result);
		}
	}

