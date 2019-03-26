import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class ALWAYS_DEMO {	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scr=new Scanner (System.in);
	String str=new String();
	str=scr.next();
	str=toReverse(str);
	//System.out.println(str);
		System.out.println(getSSAscii(str));
	}
public static void getSSAscii (String str,String ans )
{
 if (str.length()==0)
 {
	String br=new String());
	 br.
	 return ;
 }
 char ch=str.charAt(0);
  String ros=str.substring(1);
  ArrayList<String> rr=getSSAscii(ros);
  ArrayList<String> mr=new ArrayList<>();
  for (String val: rr)
  {
	  mr.add(val);
	  mr.add(ch+val);
	  mr.add((int)ch+val);
  }
  return mr;
  }
public static String toReverse (String str)
{String rev=new String();
rev="";
	for (int i=str.length()-1;i>=0;i--)
		rev+=str.charAt(i);
return rev;
}
}

