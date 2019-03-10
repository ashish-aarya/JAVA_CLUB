package ASSIGNMENT;

import java.util.Scanner;

public class Recursion_Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		System.out.println("ENter");
		Scanner scr=new Scanner (System.in);
		n=scr.nextInt();	      
	    int temp = rev(n, 0); 
	    
	    if (temp == n) 
	        System.out.println("true");
	    else
	        System.out.println("false");
	}


public static int rev(int n, int temp) 
{ 
    // base case 
    if (n == 0) 
        return temp; 
  
    // stores the reverse of a number 
    temp = (temp * 10) + (n % 10); 
  
    return rev(n / 10, temp); 
} 
}
 