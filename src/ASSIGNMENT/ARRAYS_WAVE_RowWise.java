package ASSIGNMENT;
import java.util.Scanner;
public class ARRAYS_WAVE_RowWise {
public static void main (String args [])
{Scanner scr=new Scanner(System.in);
	int n,m;
	System.out.println("Enter");
	n=scr.nextInt ();
	m=scr.nextInt();
	int ar[][]=new int [n][m];
	for (int i=0;i<n;i++)
	{
		for (int j=0;j<m;j++)
			ar[i][j]=scr.nextInt(); 
	}
	wave_disp(ar);
	System.out.print("END");
	
}

		public static void wave_disp(int arr[][]) {
	
			for (int r=0;r<arr.length;r++)
			{
				if (r%2==0)
				{
					for (int c=0;c<arr[0].length;c++)
						System.out.println(arr[r][c]+", ");
				}
				else
					{for (int c=arr[0].length-1;c>=0;c--)
						System.out.println(arr[r][c]+", ");
					}
			}
		}
}
		