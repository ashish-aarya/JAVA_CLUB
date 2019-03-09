package ASSIGNMENT;

import java.util.Scanner;

public class CONTAINED_IN_AN_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int ar[];
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		ar = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = scr.nextInt();
		int s=scr.nextInt();
		
 if (searchfs(ar, 0, s)!=-1)
	 System.out.println("true");
 else 
	 System.out.println("False");
	}

	public static int searchfs(int ar[], int vid, int item) {
		if (vid == ar.length)
			return -1;
		if (item == ar[vid])
			return vid;
		int rsc = searchfs(ar, vid + 1, item);

		return rsc;

	}


}
