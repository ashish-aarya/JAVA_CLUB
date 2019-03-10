package ASSIGNMENT;
import java.util.Scanner;

public class BASIC_CALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Your Code Here

		// TODO Auto-generated method stub
		char ch='a';
		int a = 0, b = 0;
		boolean cond = true;
//		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		while (ch!='x'&&ch!='X') {
			ch = s.next().charAt(0);
		if (ch == '+' || ch == '-' || ch == '/' || ch == '%' || ch == '*') {
				a = s.nextInt();
				b = s.nextInt();
			}
			switch (ch) {
			case '+': {
				int sum = a + b;
				System.out.println(sum);

				cond = true;
				break;
			}
			case '-':

			{
				int diff = a > b ? a - b : b - a;
				System.out.println(diff);

				cond = true;
				break;
			}
			case '/': {
				int div = a > b ? a / b : b / a;
				System.out.println(div);

				cond = true;
				break;
			}
			case '*': {
				int mul = a * b;
				System.out.println(mul);
				cond = true;
				break;
			}
			case '%': {
				int rem = a % b;
				System.out.println(rem);

				cond = true;
				break;
			}
			case 'x':
				break;
			case 'X':
					break;
			default: {
				System.out.println("Invalid operation. Try again.");
				cond = true;
			}

			}
		}

	}
}