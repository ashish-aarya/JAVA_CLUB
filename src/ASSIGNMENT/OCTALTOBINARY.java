import java.util.Scanner;

public class OCTALTOBINARY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	       System.out.println ("Enter the no.");
	       Scanner s=new Scanner(System.in);
	       n=s.nextInt();
	       int mul=1,ans=0;
	       int temp=n,answer=0;
	       while (temp!=0)
	       {
	    	   int rem=temp%10;
	    	   temp=temp/10;
	    	   ans=ans+(rem*mul);
	    	   mul=mul*8;
	    	   
	       }//System.out.println(ans);
	       mul=1;
	       while (ans!=0)
	       {
	    	   int rem=ans%2;
	    	   ans=ans/2;
	    	   answer=answer+(rem*mul);
	    	   mul=mul*10;
	    	   
	       }
	       System.out.println(answer);
	}

}
