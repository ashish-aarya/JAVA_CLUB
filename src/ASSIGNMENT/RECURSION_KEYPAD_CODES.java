package ASSIGNMENT;

import java.util.Scanner;

public class RECURSION_KEYPAD_CODES {

	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scr = new Scanner(System.in);
		System.out.println("ENTER");
		String scn = scr.next();
		printKPC(scn,"");
		System.out.println("\n"+count);
	}

	public static void printKPC(String S, String b) {
		if (S.length() == 0) {
			count++;
			System.out.print(b+" ");
			return;
		}
		char ch = S.charAt(0);
	
		String rem = S.substring(1);
		String st = getCode(ch);
		
		for (int i = 0; i < st.length(); i++) {
			char ch1 = st.charAt(i);
			//String req = st.substring(1);
		
			printKPC(rem, b+ch1 );
		}

	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

}
