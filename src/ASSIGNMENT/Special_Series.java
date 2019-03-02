import java.util.Scanner;

public class Special_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, m;
		System.out.println("Term ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Multiple");
		m = s.nextInt();
		int ans=0,tr=1;
		for (int i = 1; i <= n; i++) {
			ans=3*i+2;
			if (ans%m!=0)
				 System.out.println(ans);
				else
					n++;
				
		}
	}
}
