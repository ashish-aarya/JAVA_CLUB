import java.util.Scanner;

public class Sum_odd_even_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("ENTER THE No");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int fl = 0, sumev = 0, sumod = 0;
		int tp = n;
		while (tp != 0) {
			fl++;
			tp /= 10;
		}
		for (int i = fl; n != 0; i--) {
			if (i % 2 == 0)
				sumev += n % 10;
			else
				sumod += n % 10;
			n /= 10;
		}
		System.out.println(" AT EVEN POS="+ sumev);
		System.out.println("AT ODD POS="+ sumod);

	}

}
