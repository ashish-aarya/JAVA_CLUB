package ASSIGNMENT;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Recursion_MazePathD {
	static int count = 0;

	public static void main(String[] args) {
		int n1, n2;
		Scanner scr = new Scanner(System.in);
		n1 = scr.nextInt();
		n2 = scr.nextInt();
		printMazePathD(0, 0, n1 - 1, n2 - 1, "");
		System.out.println(count);
	}

	public static void printMazePathD(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			count++;
			System.out.print(ans + " ");
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}
		printMazePathD(cr + 1, cc, er, ec, ans + "V");
		printMazePathD(cr, cc + 1, er, ec, ans + "H");

		printMazePathD(cr + 1, cc + 1, er, ec, ans + "D");

	}

}