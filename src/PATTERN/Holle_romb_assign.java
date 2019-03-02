
import java.util.*;
import java.util.Scanner;
public class Holle_romb_assign {
    public static void main(String args[]) {
 int n;
		System.out.println("Enter the no");
		Scanner s= new Scanner (System.in);
		n=s.nextInt ();
		 int row=1,sp=1,nsp=n-1;
	       while (row<=n)
	       { int col=1;
	       sp=1;
	       while (sp<=nsp)
	    	   {
	    		   System.out.print(" ");
	    		   sp++;
	    	   }
	       
	    	   while (col<=n)
	    	   {if (col==1||col==n||row==1||row==n)
	    		   System.out.print("*");
	    	   else 
	    		   System.out.print(" ");
	    		   col++;
	    	   }row++;nsp--;
	        	   System.out.println("");
	       }
		
    }
}