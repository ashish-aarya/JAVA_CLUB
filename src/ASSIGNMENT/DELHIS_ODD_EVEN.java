package ASSIGNMENT;
import java.util.Scanner;
public class DELHIS_ODD_EVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("ENTER THE TOTAL CAR AND THEIR NO");
int n=s.nextInt();
int o,e;
for (int i=1;i<=n;i++)
{
	int carno=s.nextInt();
	o=sumofodd(carno);
	e=sumofeven(carno);
	if (e%4==0 || o%3==0)
	System.out.println("Yes");
	else 
		System.out.println("No");
}

	}
public static int sumofeven (int n)
{   int sumev=0;
	 while (n!=0)
	 {
		 if ((n%10)%2==0)
			 sumev+=n%10;
		 n/=10;
	 }
	return sumev;
}
public static int sumofodd (int n)
{   int sumod=0;
	 while (n!=0)
	 {
		 if ((n%10)%2!=0)
			 sumod+=n%10;
		 n/=10;
	 }
	return sumod;
}
}
