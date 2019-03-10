
package ASSIGNMENT;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAYS_TARGET_SUM_PAIRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Term &array&target ");
		int n,target;
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		int ar[]=new  int [n];
		for (int i=0;i<n;i++)
			ar[i]= scr.nextInt();
		Arrays.sort(ar);
		target= scr.nextInt();
		for (int p1=0;p1<n/2;p1++)
		{int sum=0;
			for (int p2=n-1;p2>=n/2;p2--)
				{
				if (ar[p1]+ar[p2]==target)
					System.out.println(ar[p1]+" and "+ar[p2]);
				}
				
		}
	}

}
