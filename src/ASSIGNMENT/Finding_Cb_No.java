package ASSIGNMENT;

import java.util.Scanner;

public class Finding_Cb_No {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		int[] arr = new int[n];
		int q = 0;
		for (int i = n; i >= 1; i--) {
			for (int j = i - 1; j >= 0; j--) {
				String str = s.substring(j, i);
				long k = Integer.parseInt(str);

				if (k == 2 || k == 3 || k == 5 || k == 7 || k == 11 || k == 13 || k == 17 || k == 19 || k == 23
						|| k == 29) {
					count++;
					i = j;

				} else if (k == 0 || k == 1 || k % 2 == 0 || k % 3 == 0 || k % 5 == 0 || k % 7 == 0 || k % 11 == 0
						|| k % 13 == 0 || k % 17 == 0 || k % 19 == 0 || k % 23 == 0 || k % 29 == 0)
					continue;

				else {
					count++;
					i = j;

				}
			}

		}
		System.out.println(count);
	}
}