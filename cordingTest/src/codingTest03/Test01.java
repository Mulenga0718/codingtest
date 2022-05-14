package codingTest03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test01 {
	public static int n;
	public static int m;
	public static int board[][];
	static void iceframe(int x, int y) {
	int way[][] = {{1,0},{-1,0},{0,1},{0,-1}};
	board[x][y] = 1;
	System.out.println("--------------------------");
	for(int way1[] : way) {
		
		int nextx = x+way1[0];
		int nexty = y+way1[1];
		
		System.out.print("nextx: "+nextx +"\tnexty: "+nexty);
		System.out.println();
		if(nextx<0 || nexty<0 || nextx> n-1 || nexty>m-1 ) {
			continue;
		}
		if(board[nextx][nexty]==0) {
			iceframe(nextx, nexty);
			
		}
				
	}		
	}
	
	
	public static void main(String[] args) {
		Random ran = new Random();
		n = 5;//ran.nextInt(1000)+1;
		m = 5;//ran.nextInt(1000)+1;
		board = new int[n][m];
		
		for(int i= 0; i<n; i++) {
			for(int j=0; j<m; j++) {
			board[i][j]= ran.nextInt(2);	
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
			System.out.print(board[i][j]+"");
			}
			System.out.println();
		}

		System.out.println();
		int count =0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(board[i][j] == 0) {
					iceframe(i,j);
					count++;
				}
		}
	}
		System.out.println("개수 : "+count);
}
}
