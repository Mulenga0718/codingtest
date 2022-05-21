package codingTestGreedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test01 {
	static ArrayList<Integer> group;
	public static void main(String[] args) {
		Random ran = new Random();
		
		int n = 10;//ran.nextInt(100000)+1;
		int member[] = new int[n];
 		
		for(int i=0; i<n; i++) {
		member[i] = ran.nextInt(n-1)+1;
		}
		
		Arrays.sort(member);
		System.out.println(Arrays.toString(member));
		int count =0;
		group = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			group.add(member[i]);
				if(member[i] == group.size()) {
				count++;  group = new ArrayList<Integer>();}
			}
		System.out.println(count);
	}
}
