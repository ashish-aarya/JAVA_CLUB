import java.util.Scanner;

public class Pattern_fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int sum = 0, a = 0, b = 1;
		System.out.print(a + "\n" + b + " ");
		for (int j=2;j<=n;j++)
		{ int i;
			if(j==2)
			 i= 2;
			else
				i=1;
		for (; i<=j; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum + " ");
		}
		System.out.println("");
		}
	}
	}


