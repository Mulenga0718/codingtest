package codingTest01;

import java.util.Random;

public class Greedy2 {
	public static void main(String[] args) {

		Random ran = new Random();

		int n = ran.nextInt(999) + 2;
		int m = ran.nextInt(10000) + 1;
		int k = ran.nextInt(m) + 1;

		System.out.println(n + " " + m + " " + k);

		int narray[] = new int[n];

		for (int i = 0; i < narray.length; i++) {
			narray[i] = ran.nextInt(10000) + 1;
			System.out.print(narray[i] + " ");
		}
		for (int i = 0; i < narray.length; i++) {
			for (int j = 0; j < narray.length; j++) {
				if (narray[i] > narray[j]) {
					int temp = narray[i];
					narray[i] = narray[j];
					narray[j] = temp;
				}
			}
		}
		int count = 0;
		int result = 0;
		while (count < m) {
			if ((count + 1) % k == 0) {
				result += narray[1];
				count++;
			} else {
				result += narray[0];
				count++;
			}
		}
		System.out.println();

		System.out.println("결과값: "+result);
	}
}
