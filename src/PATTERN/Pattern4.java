import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		 System.out.println ("Enter the term");
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
	    	   row++;nsp--;nst++;
			   System.out.println(" ");
	       }
	}

}
