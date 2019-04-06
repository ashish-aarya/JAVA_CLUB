package ASSIGNMENT;

import java.util.*;

public class Stack_Stock_Span {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n;
		n = scr.nextInt();
		int ar[] = new int[n];// = { 100, 20, 30, 90, 60, 50, 70, 80, 120, 110,
								// 50 };
		for (int i = 0; i < n; i++)
			ar[i] = scr.nextInt();
		int ans[] = StockSpan(ar);
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
		System.out.print(" END");
	}

	public static int[] StockSpan(int[] ar) throws Exception {
		// DynamicStack ds = new DynamicStack();
		LinkedList<Integer> ds = new LinkedList<>();
		int[] ans = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			while (!ds.isEmpty() && ar[i] > ar[ds.peek()]) {
				ds.pop();
			}
			if (ds.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - ds.peek();
			}

			ds.push(i);
		}
		return ans;
	}

}
