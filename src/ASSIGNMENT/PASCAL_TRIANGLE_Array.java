
package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Scanner;

public class PASCAL_TRIANGLE_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Term ");
		int n, a = 0, b = 0, sum = 0;
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		ArrayList<Integer> ps = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		ps.add(1);
		System.out.println(ps);
		for (int i = 0; i < n; i++) {
			ans.add(1);
			for (int j = 0; j <= i; j++) {
				if (i == 0 || i == j)
					a = ps.get(j);
				// && ps.size() >= 0)
				else
					b = ps.get(j + 1);
				sum = a + b;
				ans.add(sum);

			}
			System.out.println(ans);
			ps.clear();
			ps = ans;
			ans.clear();
		}

	}
}
