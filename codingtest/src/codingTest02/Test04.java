package codingTest02;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		Random ran = new Random();
		int n = ran.nextInt(48) + 3;
		int m = ran.nextInt(48) + 3;

		int board[][] = new int[n][m];
		// 보드 생성
		for (int i = 0; i < board.length; i++) {
			board[i][0] = 1;
			board[i][board[0].length - 1] = 1;
		}
		for (int j = 0; j < board[0].length; j++) {
			board[0][j] = 1;
			board[board.length - 1][j] = 1;
		}
		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length - 1; j++) {
				board[i][j] = ran.nextInt(2);
			}
		}
		// 보드 출력
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		// 캐릭터 생성
		int x = 0;
		int y = 0;

		while (true) {
			x = ran.nextInt(n);
			y = ran.nextInt(m);

			if (board[x][y] == 0) {
				board[x][y] = 1;
				break;
			}
		}
		System.out.println("x 위치: " + x);
		System.out.println("y 위치: " + y);
		// 캐릭터 움직임

		int count = 0;
		boolean flag = true;
		int move = 0;
		while (flag) {

			switch (move) {
			case 0:
				if (board[x + 1][y] == 1) {
					move++;
					break;
				} else {
					board[x + 1][y] = 1;
					x++;
					count++;
					break;
				}
			case 1:
				if (board[x][y + 1] == 1) {
					move++;
					break;
				} else {
					board[x][y + 1] = 1;
					y++;
					count++;
					break;
				}
			case 2:
				if (board[x - 1][y] == 1) {
					move++;
					break;
				} else {
					board[x - 1][y] = 1;
					x--;
					count++;
					break;
				}
			case 3:
				if (board[x + 1][y] == 1 && board[x][y + 1] == 1 && board[x - 1][y] == 1 && board[x][y - 1] == 1) {
					flag = false;
				}
				if (board[x][y - 1] == 1) {
					move = 0;
					break;
				} else {
					board[x][y - 1] = 1;
					y--;
					count++;
					break;
				}

			}
			System.out.println("x 위치: " + x);
			System.out.println("y 위치: " + y);
			System.out.println("이동횟수 : " + count);
		}
	}
}
