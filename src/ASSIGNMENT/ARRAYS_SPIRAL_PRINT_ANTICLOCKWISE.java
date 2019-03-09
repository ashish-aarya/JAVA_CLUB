package ASSIGNMENT;
import java.util.Scanner;
public class ARRAYS_SPIRAL_PRINT_ANTICLOCKWISE {
public static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
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
		spiral_disp(ar);
		System.out.print("END");
		
	}
		// TODO Auto-generated method stub
		static void spiral_disp(int arr[][]) {
			int mincol, minrow, maxcol, maxrow, count = 0;
			mincol = 0;
			minrow = 0;
			maxrow = arr.length - 1;
			maxcol = arr[0].length - 1;
			int net = arr.length * arr[0].length;
			while (count < net) {

				for (int row = minrow; row <= maxrow && count < net; row++) {
					System.out.print(arr[row][mincol] + ", ");
					count++;
				}		
				mincol++;
				for (int col = mincol; col <= maxcol && count < net; col++) {
					System.out.print(arr[maxrow][col] + ", ");
					count++;
				}
				maxrow--;
				for (int row = maxrow; row >= minrow && count < net; row--) {
					System.out.print(arr[row][maxcol] + ", ");
					count++;
				}
				maxcol--;
				for (int col = maxcol; col>= mincol && count < net; col--) {
					System.out.print(arr[minrow][col] + ", ");
					count++;
				}
				minrow++;

			}

		}
	}
