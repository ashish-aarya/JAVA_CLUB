package ASSIGNMENT;

import java.util.Scanner;

public class VON_NEUMAN_LOVES_BINARY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, n1;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		for (int i = 1; i <= n1; i++) {
			n = s.nextInt();
			decimaltobinary(n);
		}

	}

	public static void decimaltobinary(int n) {

		int mul = 1, ans = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			ans = ans + (rem * mul);
			mul = mul * 2;

		}
		System.out.println(ans);
	}
}