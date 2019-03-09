package ASSIGNMENT;
import java.util.*;
public class FIBONTH {
    public static void main(String args[]) {
        //FIBONARCY SERIES OF NTH TERM
        int n;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int sum = 0, a = 0, b = 1;
		for (int i = 3; i <= n+1 ; i++) {
			sum = a + b;
			a = b;
			b = sum;
			
		}
    
        System.out.print(sum );
    }
    
}
