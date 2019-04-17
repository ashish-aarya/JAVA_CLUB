package ASSIGNMENT;

import java.util.LinkedList;
import java.util.Scanner;

public class PRATEEK_SIR_AND_CODING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		int n;
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		for (int i = 1; i <= n; i++) {
			int c = scr.nextInt();
			if (c == 1) {
				if (!list.isEmpty()) {
					System.out.println(list.peek());
					list.pop();
				}
			} else if (c == 2) {
				int it = scr.nextInt();
				list.push(it);
			}
		}
	}

}
