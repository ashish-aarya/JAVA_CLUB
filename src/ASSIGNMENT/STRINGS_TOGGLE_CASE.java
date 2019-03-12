package ASSIGNMENT;

import java.util.Scanner;

public class STRINGS_TOGGLE_CASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("BLOCK");
		String scn = scr.next();
		toogle(scn);
	}
	public static void toogle (String str)
	{
		for (int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if (Character.isUpperCase(ch))
			System.out.println(Character.toLowerCase(ch));
		else 
			System.out.println(Character.toUpperCase(ch));
		}
	}

}
