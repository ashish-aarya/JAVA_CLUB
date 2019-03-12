
import java.util.ArrayList;
import java.util.*;
public class ALWAYS_DEMO {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("ENETE");
		Scanner scr=new Scanner (System.in);
		n=scr.nextInt();
		
		printLexicoCounting(0, n);
	}

	public static void printLexicoCounting(int curr, int end) {
		if (curr > end)
			return;
		System.out.print(curr+" ");
		int i = 0;
		if (curr == 0)
			i = 1;
		for (; i <= 9; i++) {
			printLexicoCounting(curr * 10 + i, end);
		}
	}
}
