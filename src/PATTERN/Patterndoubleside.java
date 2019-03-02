import java.util.*;
import java.util.Scanner;
public class Patterndoubleside {
    public static void main(String args[]) {
    	 int n;
         System.out.println("NO ");        
          Scanner s=new Scanner(System.in);
 	       n=s.nextInt();
 int val,nsp=n-1,nst=1,sp=1,st=1,sp2=2,nsp2=0;
 for (int row=1;row<=n;row++)
 {
	 for (sp=1;sp<=nsp;sp++)
		 {System.out.print(" ");
		 }
	 if (row<=n/2)
	val=row;
	 else
		 val=n-row+1;
		 for (st=1;st<=nst;st++)
	 {
		 System.out.print(val);
		 	 val--;
	 }if (row!=1&&row!=n)
	 {
		 for (sp2=1;sp2<nsp2;sp2++)
		 {System.out.print(" ");
		 }
	 val=1;
	 for (st=1;st<=nst;st++)
	 {
		 System.out.print(val);
		 	 val++;
	 }
}
	 if (row<=n/2)		 
	 { nsp-=2;
	 nst++;
	 nsp2+=2;}
	 else
		 {nsp+=2;
		 nsp2-=2;
	 nst--;}
	 System.out.println("");
 }
     }
}