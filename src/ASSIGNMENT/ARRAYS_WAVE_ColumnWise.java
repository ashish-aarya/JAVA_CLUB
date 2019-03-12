package ASSIGNMENT;

import java.util.Scanner;

public class ARRAYS_WAVE_ColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
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
		int s;
		for (int r = 0; r < arr[0].length; r++) {
			if (r % 2 == 0)
				s = 0;
			else
				s = arr.length - 1;
			for (int c = 0; c < arr.length; c++) {
				System.out.print(arr[s][r] + " ");
				if (r % 2 == 0)
					s++;
				else
					s--;
			}
		}
	}

}
