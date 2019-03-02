
import java.util.*;
import java.util.Scanner;

public class Number_pattern_romb {
	public static void main(String args[]) {
		// Your Code Here
		int n;
		System.out.println("NO ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int row = 1, nsp = n - 1, nst = 1;
		while (row <= 2 * n - 1) {
			int sp = 1;
			while (sp <= nsp) {
				System.out.print(" ");
				sp++;
			}
			int st = 1;
			int val;
			if (row <= n)
				val = row;
			else
				val =2*n- row ;
			while (st <= nst) {
				System.out.print(val);
				if (st <=nst/2) {
					val++;
				} else
					val--;
				st++;

			}
			if (row <= n - 1) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
			}
			row++;
			System.out.println(" ");
		}
	}
}
