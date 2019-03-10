import java.util.*;
import java.util.Scanner;

public class HOLLOWDIAMONDPATTERN {
	public static void main(String args[]) {
		// Your Code Here
		int n;
		System.out.println("Enter the no");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int st = 1, sp = 1, nsp = 0, nst = n / 2 + 1;
		for (int row = 1; row <= n; row++) {
			
			if(row == 1)
				st = 2;
			else
				st = 1;
			for (; st <= nst; st++)

				System.out.print("*");
			for (sp = 2; sp <= nsp; sp++)
				System.out.print(".");

			for (st = 1; st <= nst; st++)
				if (row != 1 && st != 1 || row != n && st != n)
					System.out.print("*");

			if (row <= n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}
			System.out.println("");
		}

	}
}