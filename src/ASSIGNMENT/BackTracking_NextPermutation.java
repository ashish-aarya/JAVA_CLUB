package ASSIGNMENT;

import java.util.Scanner;

public class BackTracking_NextPermutation {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc-- > 0) {

			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			int i = arr.length - 2;

			while (i >= 0 && arr[i] >= arr[i + 1]) {
				i--;
			}

			if (i != -1) {
				int jl = i + 1;
				int j = i + 2;

				while (j < arr.length) {

					if (arr[j] <= arr[jl] && arr[j] > arr[i]) {
						jl = j;
					}
					j++;
				}

				int temp = arr[i];
				arr[i] = arr[jl];
				arr[jl] = temp;

			}

			int k = i + 1;
			int l = arr.length - 1;

			while (k < l) {
				int t = arr[k];
				arr[k] = arr[l];
				arr[l] = t;
				k++;
				l--;
			}

			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();

		}
	}
}
