package ASSIGNMENT;

import java.util.*;

public class STRINGS_STRING_COMPRESSION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scr = new Scanner(System.in);
		String str = new String();
		str = scr.next();
		stringCompression(str);

	}

	public static void stringCompression(String str) {
		int count = 1;
		for (int i = 0; i <str.length()-1; i++) {
			
			if (str.charAt(i) == str.charAt(i+1 )&&i!=str.length()-1)
				count++;
			else {
				System.out.print(str.charAt(i));
				if (count != 1) {
					System.out.print(count);
					count = 1;
				}
			}
		}System.out.print(str.charAt(str.length()-1));
	}
}
