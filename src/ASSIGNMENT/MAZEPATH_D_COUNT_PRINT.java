package ASSIGNMENT;

import java.util.Scanner;

public class MAZEPATH_D_COUNT_PRINT {
		static int count=0;
		public static void main(String[] args) {
		
			int n,d;
			System.out.println("ENETE");
			Scanner scr=new Scanner (System.in);
			n=scr.nextInt();
			d=scr.nextInt();
			
			printMazePath("", 0, 0, n, d);
			System.out.println(count);
		}

	public static void printMazePath(String ans, int cr, int cc, int er, int ec) {
		if (cr == er && cc == er) {
			count++;
			System.out.println(ans+" ");
			return;
		}
		if (cc <= ec) {
			//for (int mo = 1; mo <= ec; mo++)
				printMazePath(ans + "H", cr, cc + 1, er, ec);
		}
		if (cr <= er) {
			//for (int mo = 1; mo <= ec; mo++)
				printMazePath(ans + "V", cr + 1, cc, er, ec);
		}
	}

}
