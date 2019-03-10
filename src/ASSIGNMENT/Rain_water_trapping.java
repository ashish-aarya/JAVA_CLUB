
package ASSIGNMENT;
import java.util.Scanner;
public class Rain_water_trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[];
	int t;
	        int n;
	        Scanner scr=new Scanner (System.in);
	        t=scr.nextInt();
	        while (t>0)
	        {
	        n=scr.nextInt();
	        arr=new int[n];
	        for (int i=0;i<n;i++)
	        arr[i]=scr.nextInt();
	int[] left = new int[arr.length];

			left[0] = arr[0];
			for (int i = 1; i < left.length; i++) {
				left[i] = Math.max(left[i - 1], arr[i]);
			}

			int[] right = new int[arr.length];

			right[right.length - 1] = arr[arr.length - 1];
			for (int i = right.length - 2; i >= 0; i--) {
				right[i] = Math.max(right[i + 1], arr[i]);
			}

			int sum = 0;

			for (int i = 0; i < arr.length; i++) {

				sum += Math.min(left[i], right[i]) - arr[i];
			}

			System.out.println(sum);
	        t--;
	        }
		}
