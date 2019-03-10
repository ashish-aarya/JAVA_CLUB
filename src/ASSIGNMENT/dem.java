import java.util.*;
import java.util.Scanner;
public class dem {
    public static void main(String args[]) {
        int n;
        System.out.println("NO");
        Scanner s= new Scanner (System.in );
        n=s.nextInt();
        int row=1,nsp=n,nst=2*row-1;
        while (row<=2*n-1)
        {
            for (int i=1;i<nsp;i++)
            {
                System.out.print (".");
            }int val=row;
            for (int j=1;j<nst;j++)
            {
                System.out.print ("*");
                if (j<row)
                val++;
                else 
                val--;
            }
            row++;
            System.out.println();
        }

    }
}