package codingTest05;

import java.util.ArrayList;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n = ran.nextInt(10)+1;
		for(int i=0; i<n; i++) {
			list.add(ran.nextInt(10)+1);
		}
		System.out.println(list);
		int m = ran.nextInt(10)+1;
		ArrayList<Integer> order = new ArrayList<Integer>();
		for(int i=0; i<m; i++) {
			order.add(ran.nextInt(10)+1);
		}
		System.out.println(order);
		
		for(int i=0; i<order.size();i++ ) {
			if(list.indexOf(order.get(i)) == -1) {
				System.out.print("no ");
			}else {
				System.out.print("yes ");
			}
		}
		
	}
}
