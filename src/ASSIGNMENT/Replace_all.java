import java.util.Scanner;

public class Replace_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the term");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int temp=0;
		while(n!=0)
		{int rem=n%10;
		n/=10;
			if (rem==0)
				rem=5;
			temp=temp*10+rem;
			//System.out.println(rem);
			
		}System.out.println(temp);
		int ans=0;
		while (temp!=0)
		{int w=temp%10;
			ans*=10+w;
			temp/=10;
		}
		
		System.out.println(ans);
	}

}
