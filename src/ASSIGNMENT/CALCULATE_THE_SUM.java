package ASSIGNMENT;

import java.util.Scanner;
import java.util.ArrayList;

public class CALCULATE_THE_SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n=scr.nextInt();
		//ArrayList<Integer> ar= new  ArrayList<>();
		int arr[]=new int[n]; 
		int ans[]=new int[n];  
	int sum=0;
		 for (int i=0;i<n;i++)
		 {arr[i]= scr.nextInt();		 
		 }
			 for (int j=0;j<arr.length;j++)
			 {int s=arr.length-1;
			 	ans[j]=arr[j]+arr[s];
			 	s--;				 
			 }

			 for (int j=0;j<arr.length;j++)
			 {
			 	ans[j]=ans[j]+ans[j];
			 					 
			 }
			 for (int w=0;w<n;w++)
				 sum+=ans[w];
			 int an=sum% ((int)Math.pow(10,9)+7);
				 
		 System.out.println(an);
	}

}
