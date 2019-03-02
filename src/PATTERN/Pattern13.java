import java.util.*;
import java.util.Scanner;;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.print("NO");
Scanner s=new Scanner (System.in);
n=s.nextInt();
int nst=1;
for (int row=1;row<2*n;row++)
{
	for (int st=1;st<=nst;st++)
		System.out.print("*");
if (row<n)
nst++;
else
	nst--;
System.out.println("");
	}
	}

}
