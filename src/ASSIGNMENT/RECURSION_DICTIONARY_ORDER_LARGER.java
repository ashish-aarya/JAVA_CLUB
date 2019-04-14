package ASSIGNMENT;

import java.util.Scanner;

public class RECURSION_DICTIONARY_ORDER_LARGER {
public static void main(String[] args) {
String str;
Scanner scr=new Scanner (System.in);
str=scr.next();
System.out.println(str);

	printPermutation("cba", "", false);
}

public static void printPermutation(String ques, String ans, String os) {

	if (ques.length() == 0) {

		if (ans.compareTo(os) >= 0) {
			System.out.println(ans);
		}

		return;
	}

	for (int i = 0; i < ques.length(); i++) {

		char ch = ques.charAt(i);
		String roq = ques.substring(0, i) + ques.substring(i + 1);

		printPermutation(roq, ans + ch, os);

	}

}

public static void printPermutation(String ques, String ans, boolean isLarger) {

	if (ques.length() == 0) {
		if (isLarger)
			System.out.println(ans);
		return;
	}

	for (int i = 0; i < ques.length(); i++) {

		char ch = ques.charAt(i);
		String roq = ques.substring(0, i) + ques.substring(i + 1);

		if (isLarger) {
			printPermutation(roq, ans + ch, true);
		} else {

			if (ch > ques.charAt(0)) {
				printPermutation(roq, ans + ch, true);
			} else if (ch == ques.charAt(0)) {
				printPermutation(roq, ans + ch, false);
			} else {
				// no call
			}

		}

	}

}

}
