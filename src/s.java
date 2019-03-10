import java.util.*;
public class s {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        	int arr[];
        	int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
        int temp[];
		temp = new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
      temp[arr[j]]=j;
		}
		for (int val:temp)
		System.out.print(val);
    }
}
}
