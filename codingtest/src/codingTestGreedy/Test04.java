package codingTestGreedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Test04 {
	static int coin[];
	static HashSet<Integer> save;
	static void carti() {
		
	}
	
	public static void main(String[] args) {
		Random ran= new Random();
		int n = 10;//ran.nextInt(1000)+1;
		save = new HashSet<Integer>();
		
		 coin = new int[n];
		for(int i=0; i<n;i++) {
			coin[i] = ran.nextInt(10);
		}
		
		System.out.println(Arrays.toString(coin));
	
	}
}
