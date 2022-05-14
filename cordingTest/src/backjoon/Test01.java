package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test01 {
	static ArrayList<Integer> save = new ArrayList<Integer>();
	static int count = 0;
	static String board[][];
	public static void search(int a, int b) {	
		int way[][] = {{1,0},{-1,0},{0,1},{0,-1}};
				
		
		for(int way1[] : way) {
			int nextx = a+way1[0];		
			int nexty = b+way1[1];
			
			if(board[nextx][nexty].equals("#") || board[nextx][nexty].equals("B")) {
				continue;
			}else {
			
				while(true) {
					board[nextx-way1[0]][nexty-way1[1]]= "#";

					if(board[nextx][nexty].equals("#") || board[nextx][nexty].equals("B")){
						 search(nextx-way1[0],nexty-way1[1]); count++; break;
					}else if(board[nextx][nexty].equals("O")) {
						count++; save.add(count); count=0; return;
					}
			}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 값: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.print("m 값: ");
		int m = Integer.parseInt(sc.nextLine());
		
		board = new String[n][m];
		
		
		for(int i = 0; i<n; i++) {
			board[i][0] = "#";
			board[i][m-1] = "#";
		}
		for(int j=0; j<m; j++) {
			board[0][j] = "#";	
			board[n-1][j] = "#";	
			}
		for(int i=1; i<n-1; i++) {
			for(int j=1; j<m-1 ; j++) {
				System.out.println("i 위치 : "+i +"\nj위치: "+j);
				board[i][j] = sc.nextLine();
			}
		}
		
		int x =0;
		int y =0; 

		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j].equals("R")) {
					x=i; y=j;
				}
			}
		}
		
		search(x,y);
		System.out.println();
		Collections.sort(save);
		System.out.println(save);
		
	}
}
