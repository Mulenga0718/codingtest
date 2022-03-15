package codingTest03;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static int n;
	public static int m;
	public static int myx = 0;
	public static int myy = 0;
	public static int nextsitex =0;
	public static int nextsitey =0;
	public static void seaerch(int x, int y) {
		int way[][] = {{1,0},{-1,0},{0,1},{0,-1}};
		
		for(int way2[] : way) {
		 nextsitex = myx + way2[0];
		 nextsitey = myy + way2[1];
		
		if(nextsitex <0 || nextsitex > n-1 || nextsitey< 0 || nextsitey >m-1) {
				continue;
			}
		
		}
	}
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		n = 5;//ran.nextInt(197)+4;
		m = 6;//ran.nextInt(197)+4;
		int board[][] = new int[n][m];
		board[0][0] = 1;
		board[n-1][m-1] = 1;
		
		for(int i= 0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(board[i][j] == 1) {
					continue;
				}else {
					board[i][j] = Integer.parseInt(sc.nextLine());
				}
			}
		}
		int count =0;
		
		for(int i= 0; i<n; i++) {
			for(int j=0; j<m; j++) {
			if(board[i][j] == 1) {
				
				count++; 
			}
			}
			
			}
		
		
	}
}
