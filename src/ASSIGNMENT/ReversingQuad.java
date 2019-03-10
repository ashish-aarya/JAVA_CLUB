import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ReversingQuad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0, a, b, c;
		System.out.println("ENTER THE No.'s");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = b * b - 4 * a * c;
		if (d == 0) {
			System.out.println("Real and Equal ");
			roots(a, b, c);
		} else if (d < 0)
			System.out.println("Imaginary");
		else if (d > 0) {
			System.out.println("Real and Distinct");
			roots(a, b, c);
		}
	}

	public static void roots(int a, int b, int c) {
		int d = b * b - 4 * a * c;
		int rts = (-b + (int) Math.sqrt(d)) / (2 * a);
		int rt = (-b - (int) Math.sqrt(d)) / (2 * a);
		System.out.print(rt + " ");
		System.out.println(rts);
	}
}