import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the no");
		Scanner s= new Scanner (System.in);
		n=s.nextInt ();
		 int row=1;
	       while (row<=n)
	       { int col=1;
	    	   while (col<=n)
	    	   {if (col==1||col==n||row==1||row==n)
	    		   System.out.print("*");
	    	   else 
	    		   System.out.print(" ");
	    		   col++;
	    	   }row++;
	        	   System.out.println("");
	       }
		

	}

}
