package ASSIGNMENT;
import java.util.Scanner;

public class BOSTON_NUMBERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 +
		// 3 + 3 + 7.
		int n;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int temp = n, fc = 0, i = 1, sum = 0;
		while (temp != 0) {

			if (checkprime(i) == true) {
				if (temp % i == 0) {
					System.out.println(i);
					fc += i;
					i = 1;
					temp /= 10;

				}
			} else
				i++;

		}
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		if (sum == fc)
			System.out.println("1");
		else
			System.out.println("0");
	}

	static boolean checkprime(int n) {
		int flag = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				flag++;
		}
		if (flag == 2)
			return true;
		else
			return false;
	}
}
