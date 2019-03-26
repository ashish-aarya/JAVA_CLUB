package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Recursion_SubSequence_ASCII {
	static int count=0;
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER");
		String str = new String();
		str = scr.next();
		str=toReverse(str);
		//System.out.println(str);
		printSSASCII(str,"");
		System.out.println("\n"+count);
	}

	public static void printSSASCII(String qus, String ans) {
		if (qus.length() == 0) {
			count++;
			System.out.print(ans+" ");
			return;
		}
		char ch = qus.charAt(0);
		String req = qus.substring(1);
		printSSASCII(req, ans);
		printSSASCII(req, ans + ch);
		printSSASCII(req, ans + (int) ch);

	}

	public static String toReverse(String str) {
		String rev = new String();
		rev = "";
		for (int i = str.length() - 1; i >= 0; i--)
			rev += str.charAt(i);
		return rev;
	}
}
