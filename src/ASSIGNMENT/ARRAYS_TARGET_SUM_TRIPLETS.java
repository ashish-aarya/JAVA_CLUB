package ASSIGNMENT;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAYS_TARGET_SUM_TRIPLETS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Term &array&target ");
		int n, target;
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = scr.nextInt();
		Arrays.sort(ar);
		target = scr.nextInt();
		for (int p1 = 0; p1 < n; p1++) {

			for (int p2 = p1 + 1; p2 < n; p2++) {
				for (int p3 = p2 + 1; p3 < n; p3++)
					if (ar[p1] + ar[p2] + ar[p3] == target)
						System.out.println(ar[p1] + " " + ar[p2] + " and " + ar[p3]);
			}

		}
	}

}
