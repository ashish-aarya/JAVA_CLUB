
package ASSIGNMENT;
import java.util.Scanner;
public class RECURSION_CONVERT_STRINGTOINTEGER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		compare(str);

	}

	public static void compare(String S) {

		int n1 = Integer.parseInt(S);
		System.out.println(n1);

	}

}
