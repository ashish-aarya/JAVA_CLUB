package ASSIGNMENT;

import java.util.Scanner;

public class Recursion_REVERSE_AN_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER");
		int n = scr.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = scr.nextInt();

		rev_array(ar, n - 1);
	}

	public static void rev_array(int ar[], int n) {
		if (n < 0)
			return;

		System.out.println(ar[n]);
		rev_array(ar, n - 1);
	}

}
