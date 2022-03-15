package codingTest04;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(500)+1;
		int arraynum[] = new int[num];
		
		for(int i=0; i<num; i++) {
			arraynum[i]= ran.nextInt(100000)+1;
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(arraynum[i] > arraynum[j]) {
					int temp = arraynum[i];
					arraynum[i] = arraynum[j];
					arraynum[j] = temp;
				}
			}
		}
		System.out.println(num);
		System.out.println();
		for(int a : arraynum) {
			System.out.println(a);
		}
		
	}
}
