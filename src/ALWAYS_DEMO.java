import java.util.*;
public class ALWAYS_DEMO{

	public static void main(String[] args) {
Scanner scr=new Scanner (System.in);
int n;
int tc=scr.nextInt();
while (tc>0)
{
n=scr.nextInt();
		int[] arr =new int [n];
		for (int i=0;i<n;i++)
		arr[i]=scr.nextInt();
		
		System.out.println(arrayGame(arr, 0, arr.length - 1));

    tc--;
}
	}

	public static int arrayGame(int[] arr, int lo, int hi) {

		for (int mid = lo; mid < hi; mid++) {

			int sum1 = 0;
			for (int i = lo; i <= mid; i++) {
				sum1 += arr[i];
			}

			int sum2 = 0;
			for (int i = mid + 1; i <= hi; i++) {
				sum2 += arr[i];
			}

			if (sum1 == sum2) {

				int ans1 = arrayGame(arr, lo, mid);
				int ans2 = arrayGame(arr, mid + 1, hi);

				return Math.max(ans1, ans2) + 1;
			}

		}

		return 0;

	}
}
