import java.util.*;
import java.util.Scanner;
public class Pattern17 {
    public static void main(String args[]) {
        // Your Code Here
          int n;
		System.out.println("Enter the no");
		Scanner s= new Scanner (System.in);
		n=s.nextInt ();
		 int row=1,sp=1,st=1,nst=n/2,nsp=1;
		 while (row<=n)
		 {st=1;
		 while(st<=nst)
		 {System.out.print("* ");
		 
		 st++;
		 }
		 sp=1;
		 while (sp<=nsp)
		 {
		     System.out.print("  ");
		     sp++;
		 }
		 st=1;
		 while(st<=nst)
		 { 
			 System.out.print("* ");
		 
		 st++;
		 }
			 if (row<=n/2)
		 {nst--;
		 nsp+=2;
		 
		 }
		 else
		 {nst++;
		 nsp-=2;
		     		 }
   	 row++;
   	 System.out.println("");
		     
		 }
}
}