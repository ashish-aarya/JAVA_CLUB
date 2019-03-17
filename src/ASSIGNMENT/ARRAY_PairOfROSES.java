package ASSIGNMENT;
import java.util.Scanner;
import java.util.Arrays;
public class ARRAY_PairOfROSES {
    public static void main(String args[]) {
    
        Scanner scn = new Scanner (System.in);
        int test = scn.nextInt();
        
        while(test > 0) {
            int numRoses = scn.nextInt();
            
            int [] arr = new int[numRoses];
            for(int i=0;i<arr.length;i++) {
                arr[i] = scn.nextInt();
            }
            
            int money = scn.nextInt();
            Arrays.sort(arr);
            pairofRoses(arr,money);
            test--;
        }
    }
    public static void pairofRoses(int [] arr , int money) {
        int minsum = Integer.MAX_VALUE;
        int price1 = 0;
        int price2 = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == money)
                {
                    int diff = arr[i] - arr[j];
                int absdiff = Math.abs(diff);
                if(absdiff<minsum)
                {
                    minsum=absdiff;
                    price1 = arr[i];
                    price2 = arr[j];
                }
                
                
                }
                
            }
        }
        
         System.out.println("Deepak should buy roses whose prices are " + price1 + " and " + price2 + ".");
        
      
        
    }
    
}