import java.util.*;
import java.util.Scanner;
public class PATTERNHOURGLASS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    System.out.println ("NO");
	Scanner s=new Scanner (System.in);
	n=s.nextInt();
	int sp=1,st=1,nsp=0,nst=n*2+1,val;
	for (int row=0;row<=n*2;row++)
	{
		for (sp=1;sp<=nsp;sp++)
		{
			System.out.print(" ");
		}if (row<=n)
		val=n-row;
		else
			val=row-n;
		for (st=1;st<=nst;st++)
		{
			System.out.print(val);
			if (st<=nst/2)
				val--;
			else
				val++;
		}
		if (row<n)
		{nsp++;
		nst-=2;
		}
		else 
			{nsp--;
		nst+=2;}
		System.out.println(" ");
	}
	}
}