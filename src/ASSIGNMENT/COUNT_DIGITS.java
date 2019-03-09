import java.util.Scanner;

public class COUNT_DIGITS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f;
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Enter the no to find");
       f=s.nextInt();
int flag=0;
       while (n!=0)
       {
    	   if (n%10==f)
    		   flag++;
    	   n/=10;
       }
       System.out.println("No of Rep. Digit"+flag);

	}

}
