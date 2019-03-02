import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,lcm;
		System.out.println("NO.");
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
	}

}
