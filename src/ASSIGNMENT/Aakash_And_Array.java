package ASSIGNMENT;

import java.util.Arrays;
import java.util.Scanner;

public class Aakash_And_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner (System.in);
		int n,m,o;
		n=scr.nextInt();
		m=scr.nextInt();
		o=scr.nextInt();
    	int[] a = new int [n];
		int[] b = new int [m];
		int[] c = new int [o];
		for (int i=0;i<n;i++)
			a[i]=scr.nextInt();
		for (int j=0;j<m;j++)
			b[j]=scr.nextInt();
		for (int k=0;k<o;k++)
			c[k]=scr.nextInt();		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		int ans = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length && k < c.length) {

			int min = Math.min(a[i], Math.min(b[j], c[k]));
			int max = Math.max(a[i], Math.max(b[j], c[k]));

			if (max - min < ans) {
				ans = max - min;
			}

			if (ans == 0) {
				break;
			}

			if (a[i] == min) {
				i++;
			} else if (b[j] == min) {
				j++;
			} else if (c[k] == min) {
				k++;
			}

		}

		System.out.println(ans);

	}
}
