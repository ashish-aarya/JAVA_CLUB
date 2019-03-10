package ASSIGNMENT;
import java.util.*;
import java.util.Scanner;;
public class Inverted_hour_Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.print("NO");
Scanner s=new Scanner (System.in);
n=s.nextInt();
int nst=1,val,nsp=2*n-1,st=1;
for (int row=1;row<=2*n+1;row++)
{val=n;
	for ( st=1;st<=nst;st++)
		{System.out.print(val);
	val--;
	}
	for (int sp=1;sp<=nsp;sp++)
	{System.out.print(" ");

}
	st=1;
	if (row<=n)
	{val=n-row+1;}
else
	{val=row-n-1;}
	if (row==n+1)
		{st=2;
		val=1;
		}
	for ( ;st<=nst;st++)
		{System.out.print(val);
	val++;
	}
if (row<=n)
{nst++;
nsp-=2;
}else
	{nst--;
nsp+=2;}
System.out.println(" ");
	}
	}

}
