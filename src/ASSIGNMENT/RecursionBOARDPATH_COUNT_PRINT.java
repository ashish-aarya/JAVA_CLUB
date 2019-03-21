package ASSIGNMENT;

import java.util.Scanner;

public class RecursionBOARDPATH_COUNT_PRINT {
static int count=0;
	public static void main(String[] args) {
	
		int n,d;
		//System.out.println("ENETE");
		Scanner scr=new Scanner (System.in);
		n=scr.nextInt();
		d=scr.nextInt();
		
		PrintBoardPath("", 0, n,d);
		System.out.println(count);
	}

	public static void PrintBoardPath(String ans, int start, int end,int dice) {
		if (start == end) {
			count++;
			System.out.println(ans+" ");
			return;
		}
		if (start > end)
			return;
		for (int i = 1; i <= dice; i++)
			PrintBoardPath(ans + i, start + i, end,dice);

	}

}
