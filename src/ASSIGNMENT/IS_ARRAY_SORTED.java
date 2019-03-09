package ASSIGNMENT;

import java.util.Scanner;

public class IS_ARRAY_SORTED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = scr.nextInt();
		if(isshorted (ar,n-1)==1)
			System.out.println("Yes");
		else 
			System.out.println("No");
			}

	public static int isshorted(int[] ar, int n) {
		// TODO Auto-generated method stub
		
		if (n==1||n==0)
			return 1;
		if (ar[n-2]>ar[n-1])
		return 0;
		return isshorted(ar, n-1);
					
					
		
	}

}
