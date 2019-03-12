package ASSIGNMENT;

import java.util.Scanner;

public class STRINGS_DIFFERENCE_IN_ASCII_CODES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER");
		String scn = scr.next();
		Acii_DIFF(scn);
	}
	public static void Acii_DIFF (String st)
	{
		for (int i=0;i<st.length();i++)
		{
			if (i!=st.length()-1)
			{int ch=st.charAt(i+1);
			int ch2=st.charAt(i);
			int diff=ch-ch2;
				System.out.print(st.charAt(i)+""+diff+"");
			}
			else 
				System.out.print(st.charAt(i));
		}
	}
}
