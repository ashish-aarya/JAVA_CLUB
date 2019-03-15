
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class ALWAYS_DEMO {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scr=new Scanner (System.in);
		n=scr.nextInt();
		parenthesis(n, "", 0, 0);
	}

	public static void parenthesis(int n, String ans, int open, int close) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open)
			return;
	
		parenthesis(n, ans +")" , open, close + 1);
		parenthesis(n, ans +"(" , open + 1, close);
	}

}
