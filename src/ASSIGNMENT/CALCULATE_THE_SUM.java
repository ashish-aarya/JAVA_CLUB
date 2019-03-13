package ASSIGNMENT;

import java.util.Scanner;
import java.util.ArrayList;

public class CALCULATE_THE_SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER");
		Scanner scr = new Scanner(System.in);
		// int c = scr.nextInt();

		int n = scr.nextInt();
		// ArrayList<Integer> ar= new ArrayList<>();
		int arr[] = new int[n];
		int rt[] = new int[n];
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = scr.nextInt();
		}
		int val = scr.nextInt();
		while (val  > 0) {
			int ans[] = new int[n];
			rt = rotat(arr, val);
			for (int j = 0; j < n; j++)
				ans[j] = arr[j] + rt[j];
			val = val - 1;
			arr = ans;
		}
		for (int j = 0; j < n; j++)
			sum += arr[j];
		int an = sum % ((int) Math.pow(10, 9) + 7);

		System.out.println(an);

	}

	public static int[] rotat(int ar[], int val) {
		val = val % ar.length;
		if (val < 0)
			val = val + ar.length;
		for (int pr = 1; pr <= val; pr++) {
			int temp = ar[ar.length - 1];
			for (int i = ar.length - 1; i >= 1; i--) {
				ar[i] = ar[i - 1];
			}

			ar[0] = temp;
		}
		return ar;
	}
}
