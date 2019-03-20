
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class ALWAYS_DEMO {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc;
		Scanner scr= new Scanner(System.in);
		String scn= scr.next ();
		System.out.println(getSSAscii(scn));
	}
public staticvoid getSSAscii (String str)
{
 if (str.length()==0)
 {
	 ArrayList<String> br=new ArrayList<>();
	 br.add("");
	 return br;
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
}
