import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	       System.out.println ("Enter the term");
	       Scanner s=new Scanner(System.in);
	       n=s.nextInt();
		 int row=1;
	       while (row<=n)
	       { int col=n;
	    	   while (col>=row)
	    	   {
	    		   System.out.print("*");
	    		   col--;
	    	   }row++;
	        	   System.out.println(" ");
	       }

	}

}
