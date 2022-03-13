package codingTest02;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String board[][] = new String[8][8];
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j]= ((char)(97+j)+""+(i+1));
			}
		}
		int x = 0;
		int y = 0;
				
		String site = sc.nextLine();
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(site.equals(board[i][j])) {
					x=i;
					y=j;
					break;
				};
			}
		}

		int count=8;
		if(x+2>7 || y+1>7) {count--;}
		if(x+2>7 || y-1<0) {count--;}
		if(x-2<0 || y+1>7) {count--;}
		if(x-2<0 || y-1<0) {count--;}
		if(x+1>7 || y+2>7) {count--;}
		if(x-1<0 || y+2>7) {count--;}
		if(x+1>7 || y-2<0) {count--;}
		if(x-1<0 || y-2<0) {count--;}
		
	System.out.println(count);
}
}
