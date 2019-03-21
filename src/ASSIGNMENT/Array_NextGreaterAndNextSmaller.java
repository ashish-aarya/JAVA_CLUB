package ASSIGNMENT;
import java.util.*;
public class Array_NextGreaterAndNextSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr= new Scanner (System.in);
		int t,n;
		int []arr;
		t=scr.nextInt();
		while (t>0)
		{
			n=scr.nextInt();
			arr=new int[n];
			for (int i=0;i<n;i++)
			{
				arr[i]=scr.nextInt();	
			}
			NextgreaterNextsmaller(arr, n);
			t--;
		}
		

	}
	public static void NextgreaterNextsmaller (int[] ar,int n)
	{
		for (int i=0;i<n;i++)
		{
			for (int j=1;j<n;j++)
			{
				if (ar[i]<ar[j])
				{
					for (int k=j;k<n;k++)
						if (ar[j]>ar[j+1])
							System.out.println(ar[j+1]+" ");
						else 
							System.out.println("-1 ");
				}
				else 
					System.out.println("-1 ");
			}
		}
	}

}
