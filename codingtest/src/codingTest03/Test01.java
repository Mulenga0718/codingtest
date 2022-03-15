package codingTest03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test01 {
	public static int[][] board;
	public static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	public static int n, m;
	public static void dfs(int x, int y) {
		board[x][y] = 1;
		
		for (int[] direction : directions) {
			int nextX = x + direction[0];
			int nextY = y + direction[1];
			
			if (nextX < 0 || nextY < 0 || nextX > n - 1 || nextY > m - 1) {
				continue;
			}
			
			if (board[nextX][nextY] != 1) {
				dfs(nextX, nextY);
			}
		}
	}
	public static void main(String[] args) {
		Random ran = new Random();
		 n = 5;//ran.nextInt(1000)+1;
		 m = 5;//ran.nextInt(1000)+1;
		board = new int[n][m];
		for(int i=0; i<n;i++) {
			for(int j=0; j<m; j++) {
				board[i][j] = ran.nextInt(2);
		}	
	}
		for(int a[] : board) {
			for(int b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
		int count =0;
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<m; j++) {
				if(board[i][j]==0) {
					dfs(i,j);
					++count;
				}
			}
}
		System.out.println(count);
}
}