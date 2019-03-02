import java.util.*;
import java.util.Scanner;
public class Pattern18 {
    public static void main(String args[]) {
        // Your Code Here
        int n;
        System.out.println("NO ");        
         Scanner s=new Scanner(System.in);
	       n=s.nextInt();
		 int row=1,nsp=n-1,nst=1;
	       while (row<=n)
	       { int sp=1;
	    	   while (sp<=nsp)
	    	   {
	    		   System.out.print(" ");
	    		   sp++;
	    	   }int st=1;
	    	   while (st<=nst)
	    	   {
	    		   System.out.print("*");
	    		  
	    		   st++;
	    		   
	    	   }
	    	   if (row<=n/2)
	    	   {nsp--;nst+=2;}
	    	   else
	    	   {nsp++;nst-=2;}
	    	   row++;
			   System.out.println(" ");
	       }
    }
}
