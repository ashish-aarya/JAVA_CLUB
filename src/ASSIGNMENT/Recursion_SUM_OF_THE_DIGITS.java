package ASSIGNMENT;
import java.util.Scanner;
public class Recursion_SUM_OF_THE_DIGITS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scr=new Scanner (System.in);
String str=scr. next ();

int n=Integer.parseInt(str);
int sum=sum_of_digit(n);
System.out.println(sum);
	}

	public static int sum_of_digit(int n) {
		// TODO Auto-generated method stub
		if (n==0)
			return 0;
		int sum=n%10+sum_of_digit(n/10);
		
		return sum;
	}
	


}
