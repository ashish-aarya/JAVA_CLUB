		import java.util.*;
		public class Replace_all_logic2 {
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        long n = s.nextLong();
		        long sum=0,mult=1;
		        
		        if(n != 0){
		        while(n!=0) {
		            long rem=n%10;
		            if(rem==0)
		                rem=5;
		            n=n/10;
		            sum+=rem*mult;
		            mult*=10;
		        }
		        }else
		            sum=5;
		System.out.println(sum);
		    }
		}
	

