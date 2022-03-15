package codingTest01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;



public class Greedy3 {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int n = ran.nextInt(100)+1;
		int m = ran.nextInt(100)+1;
		
		int card[][] = new int[n][m];
		
		for(int i=0; i<card.length; i++) {
			for(int j=0; j<card[i].length; j++) {
				card[i][j] = ran.nextInt(10000)+1;
				System.out.print(card[i][j]+"\t");
			}
			System.out.println();
		}
		int cardcollect[] = new int[n];
		
		for(int i=0; i<card.length; i++) {
			int min = card[i][0];
			for(int j=0; j<card[i].length; j++) {
				if(min > card[i][j]) {
					min = card[i][j];
				}
			}
			cardcollect[i] = min;
		}
		
		System.out.println();
		System.out.println(cardcollect[n-1]);
		
	}
}
