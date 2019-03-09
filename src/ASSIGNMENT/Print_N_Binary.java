package ASSIGNMENT;

import java.util.Scanner;

public class Print_N_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scr = new Scanner(System.in);
		int test;
		test = scr.nextInt();
		while (test >0)
		{
			int term=scr.nextInt();
			for (int n=1;n<=term;n++)
			{
		      System.out.println(DECTOBIN(n));
			}
			--test;
		}
	}

	public static int DECTOBIN(int n) {
		// DECIMAL TO BIN

	       int mul=1,ans=0;
	       while (n!=0)
	       {
	    	   int rem=n%2;
	    	   n=n/2;
	    	   ans=ans+(rem*mul);
	    	   mul=mul*10;
	    	   
	       }
	     return ans;
	    		   
	}
}
