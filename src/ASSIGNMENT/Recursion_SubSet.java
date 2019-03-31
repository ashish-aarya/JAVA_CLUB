package ASSIGNMENT;

import java.util.*;

public class Recursion_SubSet {
static int  count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scr.nextInt();
		int t = scr.nextInt();

		subsetTarget(arr, 0, 0, "", t);
		System.out.println("\n"+count);
	}

	public static void subsetTarget(int[] arr, int vidx, int sum, String asf, int target) {

		if (vidx == arr.length) {
			if (sum == target) {
				count++;
				System.out.print (asf+" ");
			}

			return;
		}
		subsetTarget(arr, vidx + 1, sum + arr[vidx], asf + arr[vidx] + " ", target);
		subsetTarget(arr, vidx + 1, sum, asf, target);// no
		
	}
}
