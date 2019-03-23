
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class ALWAYS_DEMO {
	static int count=0;
	public static void main(String[] args) {
		int n1, n2;
		Scanner scr = new Scanner(System.in);
		n1 = scr.nextInt();
		n2 = scr.nextInt();
		printMazePathD(0, 0, n1-1, n2-1, "");
		System.out.println(count);
	}

	public static void printMazePathD(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			count++;
			System.out.print(ans+" ");
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
public static void NextgreaterNextsmaller(int[] ar, int n) {
	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < n; j++) {
			if (ar[i] < ar[j]) {
				for (int k = j + 1; k < n; k++) {
					if (ar[j] > ar[k]) {
						{
							System.out.println(ar[j + 1] + " ");
							return;
						}
					}
				}
				// else {
				// System.out.println("-1 ");
				// return;
				// }
			}
			// else
			// System.out.println("-1 ");
		}
		System.out.println("-1 ");
	}

}
}
