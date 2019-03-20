package ASSIGNMENT;

import java.util.Scanner;

public class STRINGS_MAX_FREQUENCY_CHARACTER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scr = new Scanner(System.in);

		String str = new String();
		str = scr.next();
		System.out.println(maxFrequencyCharacter(str));
		maxFrequencyCharacter(str);
	}

	public static char maxFrequencyCharacter(String str) {
		int fre[] = new int[256];
		int max = -1;
		char result = ' ';
		int len = str.length();
		//for (int i = 0; i < len; i++) 
			//System.out.println(fre[i]);
		for (int i = 0; i < len; i++) {
			//if (str.charAt(i) != ' ')
				fre[str.charAt(i)]++;
				//fre[str.charAt(i)]++;
		}
		for (int i = 0; i < len; i++) {
			if (max < fre[str.charAt(i)])
				{max = fre[str.charAt(i)];
			result = str.charAt(i);}
		}
		return result;

		//return 'a';
}

}
