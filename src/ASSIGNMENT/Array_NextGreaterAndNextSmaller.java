package ASSIGNMENT;

import java.util.*;

public class Array_NextGreaterAndNextSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scr = new Scanner(System.in);
		int t, n;
		int[] arr;
		t = scr.nextInt();
		while (t > 0) {
			n = scr.nextInt();
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scr.nextInt();
			}
			NextgreaterNextsmaller(arr, n);
			t--;
		}
	}

	public static void NextgreaterNextsmaller(int[] arr, int n) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				int flag = 0;
				if (arr[i] < arr[j]) {
					int k = 0;
					flag = 1;
					for (k = j + 1; k < n; k++) {
						if (arr[j] > arr[k]) {
							System.out.println(arr[k]);
							break;
						}

					}
					if (k == n) {
						System.out.println(-1);
						break;
					}
				}

				if (flag == 1) {
					break;
				}

			}
			if (j == n) {
				System.out.println(-1);
			}

		}
	}
}
