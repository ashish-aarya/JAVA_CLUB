import java.util.Scanner;
public class Ladder{ 
  	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println("NO.?");
int n,val=1;    
Scanner s=new Scanner(System.in);
n=s.nextInt();
            for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
         { System.out.print(val);
         System.out.print(" ");
         val++;
         }
         System.out.println("");
        }
    }
}
