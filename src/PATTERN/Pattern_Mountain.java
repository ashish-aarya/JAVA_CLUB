import java.util.*;
import java.util.Scanner;
public class Pattern_Mountain {
    public static void main(String args[]) {
        int n;
        System.out.println("NO");
       Scanner s=new Scanner (System.in);
        n=s.nextInt ();
        int nst=1,nsp=(2*n)-3,st=1,sp=1;
        for (int row=1;row<=n;row++)
        {
            int val=1;
            for (st=1;st<=nst;st++)
            {
              System.out.print(val);
              System.out.print("\t");
              val++;
            }
          for (sp=1;sp<=nsp;sp++)
            {
              System.out.print("\t");
            }
            st=1;
            val=row;
            if (row==n)
            {
                val=n-1;
                st=2;
            }
            for (;st<=nst;st++)
            {
              System.out.print(val);
              System.out.print("\t");
              val--;
            }
            System.out.println("");
            nst++;
            nsp-=2;
        }

    }
}