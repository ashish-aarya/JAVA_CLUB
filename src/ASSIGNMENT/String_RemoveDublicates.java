package ASSIGNMENT;
import java.util.Scanner;
public class String_RemoveDublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String str=s.next();

        StringBuilder sb = new StringBuilder(str);
         
        for(int i=0;i<sb.length()-1;i++) {
            if(sb.charAt(i)==sb.charAt(i+1)) {
                 sb.deleteCharAt(i+1);
                
            }
            if(i>0) {
            if(sb.charAt(i)==sb.charAt(i-1)) {
                sb.deleteCharAt(i);
            }
                }
            
        }
        if(sb.length()>1) {
        if(sb.charAt(sb.length()-1)==sb.charAt(sb.length()-2))
            sb.deleteCharAt(sb.length()-1);}
        System.out.println(sb.toString());
	}

}
