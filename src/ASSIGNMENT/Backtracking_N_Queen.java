package ASSIGNMENT;

import java.util.Scanner;

public class Backtracking_N_Queen {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		
int n=scr.nextInt();
		QueenComibinationBox2D(new boolean[n][n], 0, 0, 0, n, "");
		System.out.println("\n"+count);
	}

	public static void QueenComibinationBox2D(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		if (tq == qpsf) {
			count++;
			System.out.print(ans+" ");
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return;
		}
		if (isItSafe(board, row, col)) {
			board[row][col] = true;
			QueenComibinationBox2D(board, row, col + 1, qpsf + 1, tq, ans + "{" + (row+1) + "-" + (col+1) + "}"+" ");
			board[row][col] = false;
		}
		QueenComibinationBox2D(board, row, col + 1, qpsf, tq, ans);

	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {
		int r, c;
		// vertical
		r = row - 1;
		c = col;
		while (r >= 0) {
			if (board[r][c])
				return false;
			r--;
		}
		// horitontal
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c])
				return false;
			c--;
		}
		// left diag
		r = row - 1;
		c = col - 1;
		while(r>=0&& c >= 0) {
			if (board[r][c])
				return false;
			r--;
			c--;
		}
		// right diag
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[r].length) {
			if (board[r][c])
				return false;
			r--;
			c++;
		}
		return true;
	}

}
