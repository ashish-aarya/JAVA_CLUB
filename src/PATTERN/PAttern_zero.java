package PATTERN;

import java.util.*;
import java.util.Scanner;
public class PAttern_zero {
    public static void main(String args[]) {
        // Your Code Here
    
int n,val=1;    
System.out.println("NO");
Scanner s=new Scanner(System.in);
n=s.nextInt();
            for (int i=1;i<=n;i++)
        {val=i;
            for (int j=1;j<=i;j++)
         { if (j==1||j==i)
             System.out.print(val);
             else 
             System.out.print("0");
         //System.out.print(" ");
        
         } 
         System.out.println("");
        }
    }
}
