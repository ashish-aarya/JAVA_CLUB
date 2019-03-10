package ASSIGNMENT;

import java.util.Scanner;

public class RECURSION_NTH_TRIANGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scr = new Scanner(System.in);
		int n=scr.nextInt();
		System.out.println(tri(n));
		
	}
	public static int tri (int n)
	{
	if (n!=0)
			return n+tri(n-1);
	else 
		return n;
	
       
	}

}
